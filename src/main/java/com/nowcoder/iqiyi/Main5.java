package com.nowcoder.iqiyi;

/**
 * Created by 哓哓 on 2016/9/18 0018.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int size = 1000000;
        int size2 = 1000000;
        int day = 0;
        int[] hash = new int[size];

        Arrays.fill(hash, Integer.MIN_VALUE);

        boolean[] flag = new boolean[size];
        int[] mission = new int[size2];

        while (scanner.hasNext()) {
            int type = scanner.nextInt();
            if (type == 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                day = Math.max(day, b);
                if (b > size) {
                    hash = Arrays.copyOf(hash, b);
                    flag = Arrays.copyOf(flag, b);
                    for (int i = size; i < b; ++i)
                        hash[i] = Integer.MIN_VALUE;
                    size = b;
                }
                for (int i = a - 1; i < b; ++i) {
                    flag[i] = true;
                    hash[i] = Math.max(c, hash[i]);
                }
            } else {
                int m = scanner.nextInt();
                int c = scanner.nextInt();
                day = Math.max(day, m);
                if (m > size2) {
                    size2 = m;
                    mission = Arrays.copyOf(mission, size2);
                }
                mission[m - 1] = Math.max(mission[m - 1], c);
            }

        }
        for (int i = 0; i < day; ++i) {
            if (flag[i] && i < hash.length)
                value += hash[i];
            if (value < 0)
                value = 0;
            if (i < mission.length)
                value += mission[i];
            if (value < 0)
                value = 0;
        }
        System.out.println(value);
        scanner.close();
    }
}
