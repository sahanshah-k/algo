package sde.arrays3;

public class pow {

//    var s = solution.func(2, -2);

    public double func(double x, long num) {
        double sol = 1;
        long num_d = num;
        num = num < 0
                ? num * -1
                : num;
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                sol = sol * x;
                num = num - 1;
            }
        }
        return num_d < 0
                ? 1 / sol
                : sol;
    }

}
