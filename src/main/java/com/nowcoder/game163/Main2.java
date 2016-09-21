package com.nowcoder.game163;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[][] map = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = in.nextInt();
                }
            }
            List<Integer> res = new ArrayList<>();
            numIslands(map, res);
            if (res.size() < 1) System.out.println("0 ");
            else {
                Collections.sort(res);
                for (int a : res) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        }

        in.close();
    }


    public static void numIslands(int[][] map, List<Integer> list) {
        if (map == null || map.length == 0 || map[0].length == 0) return;
        int m = map.length;
        int n = map[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    list.add(bfs(map, i, j));
                }
            }
        }
    }

    public static int bfs(int[][] map, int i, int j) {
        int[] res = new int[1];
        Queue<Integer> queue = new LinkedList<>();
        fill(map, i, j, queue, res);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int y = cur % map[0].length;
            int x = cur / map[0].length;
            fill(map, x - 1, y, queue, res);
            fill(map, x + 1, y, queue, res);
            fill(map, x, y - 1, queue, res);
            fill(map, x, y + 1, queue, res);


        }
        return res[0];
    }

    public static void fill(int[][] map, int i, int j, Queue<Integer> queue, int[] res) {
        int m = map.length;
        int n = map[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || map[i][j] != 1) return;
        queue.add(i * n + j);
        map[i][j] = -1;
        res[0]++;
    }
}