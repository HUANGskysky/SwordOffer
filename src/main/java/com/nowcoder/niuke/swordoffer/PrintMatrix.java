package com.nowcoder.niuke.swordoffer;

import java.util.ArrayList;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        if (null == matrix || matrix.length <= 0) {
            return list;
        }

        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        for (int i = 0; 2 * i <= row && 2 * i <= col; i++) {
            printOneCircle(matrix, list, i, row - i, col -i);
        }

        return list;
    }

    private void printOneCircle(int[][] a, ArrayList<Integer> list, int start, int row, int col) {
        // 从左到右打印一行
        for (int i = start; i <= col; i++) {
            list.add(a[start][i]);
        }

        // 从上到下打印一列
        if (start == row) {
            return;
        }
        for (int i = start + 1; i <= row; i++) {
            list.add(a[i][col]);
        }

        // 从右向左打印一行
        if (start == col) {
            return;
        }
        for (int i = col - 1; i >= start; i--) {
            list.add(a[row][i]);
        }

        // 从下向上打印一列
        for (int i = row - 1; i >= start + 1; i--) {
            list.add(a[i][start]);
        }
    }
}
