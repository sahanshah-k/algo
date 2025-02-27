package sde.arrays3;

import java.util.Arrays;

public class grid_unique_paths {

    public int func(int m, int n) {
        var dp = new int[m][n];
        for (var arr: dp) {
            Arrays.fill(arr, -1);
        }
        return helper(0, 0, 0, m, n, dp);
    }

    private int helper(int count, int i, int j, int m, int n, int[][] dp) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (i == m - 1 && j == n - 1) {
            return count + 1;
        }
        dp[i][j] = helper(count, i + 1, j, m, n, dp) + helper(count, i, j + 1, m, n, dp);
        return dp[i][j];
    }
//    86493225
//    Time - 1277

}
