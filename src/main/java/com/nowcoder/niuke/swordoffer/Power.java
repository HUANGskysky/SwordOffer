package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class Power {
    public double Power(double base, int exponent) {
        if (equals(base, 0.0) && exponent < 0) {
            throw new IllegalArgumentException("0的负数次幂没有意义");
        }

        if (0 == exponent) {
            return 1.0;
        }

        double res = 0.0;
        if (exponent > 0) {
            res = core(base, exponent);
        } else {
            res = core(1.0 / base, -exponent);
        }

        return res;
    }

    private double core(double base, int exponent) {
        double res = 1.0;
        for (int i = 1; i <= exponent; i++) {
            res = res * base;
        }

        return res;
    }

    private boolean equals(double num1, double num2) {
        if (Math.abs(num1 - num2) <= 0.0000001) {
            return true;
        }
        return false;
    }
}
