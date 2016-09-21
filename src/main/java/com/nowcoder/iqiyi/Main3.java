package com.nowcoder.iqiyi;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(" ");
            String s1 = str[0];
            String s2 = str[1];
            System.out.println(times(s1, s2));
        }
        sc.close();
    }

    private static int min(int x, int y, int z) {
        int min = x;
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        return min;
    }

    public static int times(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        int i, j;
        int[][] d = new int[n + 1][m + 1];
        for (i = 0; i <= n; i++) {// 初始化第一列
            d[i][0] = i;
        }
        for (j = 0; j <= m; j++) {// 初始化第一行
            d[0][j] = j;
        }
        for (i = 1; i <= n; i++) {// 遍历str1
            char ch1 = str1.charAt(i - 1);

            // 去匹配str2
            for (j = 1; j <= m; j++) {
                char ch2 = str2.charAt(j - 1);
                int pos;// 记录相同字符,在某个矩阵位置值的增量,不是0就是1
                if (ch1 == ch2) {
                    pos = 0;
                } else {
                    pos = 1;
                }
                // 左边+1,上边+1, 左上角+temp取最小
                d[i][j] = min(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + pos);
            }
        }
        return d[n][m];
    }
}







