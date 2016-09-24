package com.nowcoder.youdao;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 哓哓 on 2016/9/22 0022.
 */
public class Main1 {

    private int total;

    private List<Integer> nodes;

    private int[][] matrix;

    private int res = 0;

    public Main1(int total, List<Integer> nodes, int[][] matrix) {
        this.total = total;
        this.nodes = nodes;
        this.matrix = matrix;
    }

    private void printStack(Stack<Integer> stack, int k) {
        for (Integer i : stack) {
            System.out.print(this.nodes.get(i - 1) + ",");
        }
        System.out.print(this.nodes.get(k - 1) + ",");
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int[][] map = new int[n + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                map[sc.nextInt()][sc.nextInt()] = 1;
            }

            for (int i = 1; i <= n; i++) {
                map[i][i] = 0;
            }

            List<Integer> nodes = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                nodes.add(i + 1);
            }

            Main1 man = new Main1(n, nodes, map);

            int origin = t1;
            int end = t2;

            Stack<Integer> stack = new Stack<>();
            stack.push(origin);
            man.dfs(-1, end, stack);

            System.out.println(man.res);
        }
    }

    private void dfs(int second, int target, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int k = stack.peek();
        int uk = second;

        if (k == target) {
            return;
        }
        for (int i = 1; i <= this.total; i++) {
            if (this.matrix[k][i] == 1 && k != i) {
                if (i == target) {
                    res++;
                    this.printStack(stack, i);
                    System.out.println();
                    continue;
                }
                stack.push(i);
                dfs(k, target, stack);
            }
        }
        stack.pop();
    }
}
