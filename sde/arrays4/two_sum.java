package sde.arrays4;

import java.util.HashMap;

public class two_sum {

    public int[] func(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            var comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{i, map.get(comp)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
