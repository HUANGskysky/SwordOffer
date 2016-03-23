package com.nowcoder.offer.problem12;

public class PrintToMaxNDigits {
	/*
	 * 输入数字n,按顺序打印出从1最大的n位十进制数
	 */

	public void print(int n) {
		if (n <= 0)
			return;
		int[] array = new int[n];
		printArray(array, 0);
	}

	private void printArray(int[] array, int n) {
		for (int i = 0; i < 10; i++) {
			if (n != array.length) {
				array[n] = i;
				printArray(array, n + 1);
			} else {
				boolean flag = false;
				for (int j = 0; j < array.length; j++) {
					if (array[j] != 0) {
						System.out.print(array[j]);
						if (!flag)
							flag = true;
					} else {
						if (flag)
							System.out.print(array[j]);
					}
				}
				System.out.println();
				return;
			}
		}
	}

}
