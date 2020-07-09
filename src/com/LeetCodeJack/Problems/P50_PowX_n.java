package com.LeetCodeJack.Problems;

public class P50_PowX_n {
    public double myPow(double x, int n) {
        return helperPow(x, n);
    }

    private double helperPow(double x, int n) {
        if (n == 0 || x == 0)
            return 1;

        if (n == 1)
            return x;
        if (n % 2 == 1)
            return x * helperPow(x, n - 1);
        if (n > 0)
            return helperPow(x * x, n / 2);
        if (n < 0)
            return 1 / (x * helperPow(x, -(n + 1)));
        return x;
    }
}
