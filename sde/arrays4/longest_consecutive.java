package sde.arrays4;

import java.util.HashSet;

public class longest_consecutive {

    //100,4,200,1,3,2
    //4

    public int func(int[] nums) {
        var set = new HashSet<Integer>();
        for (int n : nums) {
            set.add(n);
        }
        var out = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                var count = 1;
                var v = n;
                while (set.contains(v + 1)) {
                    count++;
                    v++;
                }
                out = Math.max(count, out);
            }
        }
        return out;
    }

}
