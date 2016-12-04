package com.nowcoder.youku;

/**
 * Created by 哓哓 on 10/15/2016.
 */

import java.util.Scanner;

public class Main2 {

    public static int lastdigit(int n) {
        String str = String.valueOf(n);
        int[] mod = new int[]{1, 1, 2, 6, 4, 2, 2, 4, 2, 8, 4,
                4, 8, 4, 6, 8, 8, 6, 8, 2};
        int[] temp = new int[10005];
        int len = str.length();
        int i, c, ret = 1;
        if (len == 1)
            return mod[str.charAt(0) - '0'];
        for (i = 0; i < len; i++)
            temp[i] = str.charAt(len - 1 - i) - '0';

        for (; len > 0; len -= ~temp[len - 1]) {
            ret = ret * mod[temp[1] % 2 * 10 + temp[0]] % 5;
            for (c = 0, i = len - 1; i >= 0; i--) {
                c = c * 10 + temp[i];
                temp[i] = c / 5;
                c %= 5;
            }
        }
        return ret + ret % 2 * 5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        System.out.println(lastdigit(n));

    }
}

