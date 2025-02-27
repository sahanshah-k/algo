package sde.arrays3;

import java.util.ArrayList;

public class majority_element_n3 {

    public ArrayList<Integer> func(int[] nums) {
        int vote1, vote2, maj1, maj2;
        vote1 = vote2 = maj1 = maj2 = 0;

        for (var n: nums) {
            if (maj1 == n) {
                vote1 ++;
            } else if (maj2 == n) {
                vote2 ++;
            } else if (vote1 == 0) {
                maj1 = n;
                vote1 = 1;
            } else if (vote2 == 0) {
                maj2 = n;
                vote2 = 1;
            } else {
                vote1 --;
                vote2 --;
            }
        }
        int nBy3 = nums.length / 3;
        var counts = new int[]{0, 0};
        for (var n: nums) {
            if (maj1 == n) {
                counts[0] += 1;
            } else if (maj2 == n) {
                counts[1] += 1;
            }
        }
        var out = new ArrayList<Integer>();
        if (counts[0] > nBy3) {
            out.add(maj1);
        }
        if (counts[1] > nBy3) {
            out.add(maj2);
        }
        return out;
    }

}
