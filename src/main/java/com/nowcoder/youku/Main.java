package com.nowcoder.youku;

/**
 * Created by 哓哓 on 10/15/2016.
 */
public class Main {

    public static void main(String[] args) {
        int n = sumOfSeries(10);
        System.out.println(n);
    }

    public static int sumOfSeries(int k) {
        if (1 == k) {
            return 2;
        }
        int n = 0;
        double res = 0.0;
        while (res < k) {
            n++;
            res += 1/(n*1.0);
        }

        return n;
    }
}
