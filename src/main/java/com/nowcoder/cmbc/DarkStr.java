package com.nowcoder.cmbc;

import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/12 0012.
 */
public class DarkStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(get(n));
        }
        sc.close();
    }

    public static int get(int n) {
        if (n < 1 || n >= 30) {
            return 0;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 9;
        }

        int num1 = 9;
        int num2 = 3;
        int res = 6;

        for (int i = 3; i <= n; i++) {
            res = 2 * (num1 - num2);
            num2 = num1;
            num1 = num2 + res;
        }

        return num1;
    }
}
