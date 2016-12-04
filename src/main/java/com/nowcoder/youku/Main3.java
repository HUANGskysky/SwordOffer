package com.nowcoder.youku;

/**
 * Created by 哓哓 on 10/15/2016.
 */
public class Main3 {
    public static void main(String[] args) {
        int sum = maxCommanFactor(2, 12);
        System.out.println(sum);

    }
    public static int maxCommanFactor(int a, int b) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if (a == getGCD(i, j) && b == getMCM(i, j)) {
                    count++;
                }
            }
        }

        return count / 2;
    }

    public static int getGCD(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }

    public static int getMCM(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }

        return -1;
    }
}
