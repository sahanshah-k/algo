package sde.arrays3;

public class search_in_2d_mat {

    //{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}

    public boolean func(int[][] mat, int t) {
        if (mat.length == 1) {
            return checkRow(mat, t, 0);
        }
        var found = false;
        var i = 0;
        for (; i < mat.length - 1; i ++) {
            var l = mat[i][0];
            var g = mat[i + 1][0];
            if (l == t || g == t) {
                return true;
            }
            if (l < t && t < g) {
                found = true;
                break;
            }
        }

        if (t > mat[i][0]) {
            found = true;
        }

        return found && checkRow(mat, t, i);
    }

    private boolean checkRow(int[][] mat, int t, int i) {
        for (var j = 0; j < mat[0].length; j++) {
            if (mat[i][j] == t) {
                return true;
            }
        }
        return false;
    }

}
