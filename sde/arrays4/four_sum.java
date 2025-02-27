package sde.arrays4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {

    public List<List<Integer>> func(int[] nums, int target) {
        Arrays.sort(nums);
        var out = new ArrayList<List<Integer>>();
        for (var first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            for (var second = first + 1; second < nums.length; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                var m = second + 1;
                var n = nums.length - 1;
                long expectedSubSum = (long)    target - (nums[first] + nums[second]);
                while (m < n) {
                    long subSum = nums[m] + nums[n];
                    if (expectedSubSum == subSum) {
                        out.add(Arrays.asList(nums[first], nums[second], nums[m], nums[n]));
                        while (m < n && nums[m] == nums[m + 1]) m++;
                        while (m < n && nums[n] == nums[n - 1]) n--;
                        m++;
                        n--;
                    } else if (subSum < expectedSubSum) {
                        m++;
                    } else {
                        n--;
                    }
                }
            }
        }
        return out;
    }

}
