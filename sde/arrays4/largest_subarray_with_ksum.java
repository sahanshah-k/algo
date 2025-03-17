package sde.arrays4;

import java.util.HashMap;

public class largest_subarray_with_ksum {

    //a, b, c, d ,e f, g
    // if sum from a to c == sum from a to f then sum from c to f  will be zero!

    public int func(int[] a) {
        var len = a.length;
        var max = 0;
        var sum = 0;
        var sumIndexMap = new HashMap<Integer, Integer>();
        for (int i =0; i < len; i ++) {
            sum += a[i];
            if (sum == 0) {
                max = Math.max(max, i + 1);
            } else {
                if (sumIndexMap.containsKey(sum)) {
                    var map_index = sumIndexMap.get(sum);
                    max = Math.max(max, i - map_index);
                } else {
                    sumIndexMap.put(sum, i);
                }
            }
        }
        return max;
    }

}
