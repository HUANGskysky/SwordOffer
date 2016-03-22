package com.nowcoder.offer.problem3;

/**
 * 二维数组查找指定数
 * @author 哓哓
 *
 */
public class Find {
	public boolean find(int[][] a, int number) {
		if (null == a) {
			return false;
		}
		int row = 0;
		int column = a[0].length - 1;
		while (row < a.length && column >= 0) {
			if (number == a[row][column]) {
				return true;
			} else if (a[row][column] > number) {
				column--;
			} else {
				row++;
			}
		}
		return false;
	}
}
