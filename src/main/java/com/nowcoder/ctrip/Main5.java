package com.nowcoder.ctrip;

import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/17 0017.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line1 = sc.nextLine();
            int n = Integer.parseInt(line1);

            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                String[] str = line.split(",");
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(str[j]);
                }
            }

            System.out.println(floyd(matrix, n)[n-1][n-1]);
        }
        sc.close();
    }

    public static int[][] floyd(int[][] map, int n) {
        int[][] dis = new int[n][n];
        for (int q = 0; q < n; q++) {
            for (int w = 0; w < n; w++) {
                dis[q][w] = map[q][w];
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dis[i][j] > dis[i][k] + dis[k][j]) {
                        dis[i][j] = dis[i][k] + dis[k][j];
                    }
                }
            }
        }
        return dis;
    }
}
