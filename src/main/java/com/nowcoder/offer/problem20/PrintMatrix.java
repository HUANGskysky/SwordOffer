package com.nowcoder.offer.problem20;

public class PrintMatrix {
	public void printMatrixByClockWise(int[][] a) {
		if (null == a) {
			return;
		}
		int start = 0;
		while (a[0].length > 2*start && a.length > 2*start) {
			printOneCircle(a, start);
			start++;
		}
	}
	
	private void printOneCircle(int[][] a, int start) {
		int rows = a.length;
		int cols = a[0].length;
		int endX = cols -1 -start;
		int endY = rows -1 -start;
		
		// 从左向右打印一行
		for (int i = start; i <= endX; i++) {
			System.out.println(a[start][i]);
		}
		
		// 从上向下打印一列
		if (start < endY) {
			for (int i = start+1; i <= endY; i++) {
				System.out.println(a[i][endX]);
			}
		}
		
		// 从右向左打印一行
		if (start < endX && start < endY) {
			for (int i = endX -1; i >= start; i--) {
				System.out.println(a[endY][i]);
			}
		}
		
		// 从下向上打印一列
		if (start < endX && start < endY - 1) {
			for (int i = endY - 1; i >= start +1; i--) {
				System.out.println(a[i][start]);
			}
		}
	}
}
