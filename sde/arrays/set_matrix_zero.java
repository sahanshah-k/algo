package sde.arrays;

import java.util.ArrayList;

public class set_matrix_zero {

    /**
     * Sample - [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
     * Output - [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
     */

    public void func(int[][] matrix) {
        var poss = new ArrayList<int[]>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    poss.add(new int[]{i, j});
                }
            }
        }
        poss.forEach(p -> {
            for (int m = 0; m < matrix.length; m++) {
                matrix[m][p[1]] = 0;
            }
            for (int m = 0; m < matrix[0].length; m++) {
                matrix[p[0]][m] = 0;
            }
        });
    }

}