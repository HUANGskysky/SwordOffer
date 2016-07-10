package com.nowcoder.offer.problem20;

public class PrintMatrix {
	public void printMatrixByClockWise(int[][] a) {
		if (null == a) {
			return;
		}
		int row = a.length - 1;
		int col = a[0].length - 1;

		for (int i = 0; i * 2 <= row && i * 2 <= col; i++) {
			printOneCircle(a, i, row - i, col - i);
		}
	}

	private void printOneCircle(int[][] a, int start, int row, int col) {

		// 从左向右打印一行
		for (int i = start; i <= col; i++) {
			System.out.println(a[start][i]);
		}

		// 从上向下打印一列
		if (start == row) {
			return;
		}
		for (int i = start + 1; i <= row; i++) {
			System.out.println(a[i][col]);
		}

		if (start == col) {
			return;
		}
		// 从右向左打印一行
		for (int i = col - 1; i >= start; i--) {
			System.out.println(a[row][i]);
		}

		// 从下向上打印一列
		for (int i = row - 1; i >= start + 1; i--) {
			System.out.println(a[i][start]);
		}
	}
}
