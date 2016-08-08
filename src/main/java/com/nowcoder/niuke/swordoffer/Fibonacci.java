package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (1 == n) {
            return 1;
        }

        int fib1 = 0;
        int fib2 = 1;
        int fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }

        return fibN;
    }
}
