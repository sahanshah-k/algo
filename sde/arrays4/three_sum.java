package sde.arrays4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {

    //[2,4,5,6,7,8]
    // take 2 and then4 to 8 continue this

    public List<List<Integer>> func(int[] nums) {
        Arrays.sort(nums);
        var out = new ArrayList<List<Integer>>();
        for (var i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                var left = i + 1;
                var right = nums.length - 1;
                var subTarget = -nums[i];
                while (left < right) {
                    var sum = nums[left] + nums[right];
                    if (sum == subTarget) {
                        out.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if ((nums[left] + nums[right]) > subTarget) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return out;
    }

}
