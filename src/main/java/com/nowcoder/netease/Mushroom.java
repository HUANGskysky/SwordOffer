package com.nowcoder.netease;

import java.util.Scanner;

public class Mushroom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int[] x = new int[k + 1];
			int[] y = new int[k + 1];
			int[][] board = new int[n + 1][m + 1];
			for (int i = 1; i <= k; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				board[x[i]][y[i]]++;
			}
			for (int p=1; p<=n; p++) {
				for (int q=1; q<=m; q++) {
					System.out.print(board[p][q] + " ");
				}
				System.out.println();
			}
			System.out.println("============");
			int res1 = findMaxSum(board, m, n);
			for (int p=1; p<=n; p++) {
				for (int q=1; q<=m; q++) {
					System.out.print(board[p][q] + " ");
				}
				System.out.println();
			}
			System.out.println("==============");
			int res2 = findMaxSum(board, m, n);
			System.out.println("res=" + (res1+res2));
		}
		
	}
	
	private static int findMaxSum(int[][] board, int m, int n) {
		
		System.out.println();
		int max = -1;
		int sum = 0;
		int maxX = 0;
		int maxY = 0;
		for (int t1 = 1; t1 <= m-2; t1++) {
			for (int t2 = 1; t2 <= n-2; t2++) {
				int i=0,j=0;
				for (i = t2; i <= t2+2; i++) {
					for (j = t1; j <= t1+2; j++) {
						sum += board[i][j];
					}
				}
				if (sum > max) {
					max = sum;
					maxX = i-1;
					maxY = j-1;
				}
				sum = 0;
			}
		}
		System.out.println("maxX=" + maxX);
		System.out.println("maxY="+maxY);
		for (int i = maxX; i >= maxX-2; i--) {
			for (int j = maxY; j>=maxY-2; j--) {
				board[i][j]=0;
			}
		}
		System.out.println("max=" + max);
		return max;
	}
}
