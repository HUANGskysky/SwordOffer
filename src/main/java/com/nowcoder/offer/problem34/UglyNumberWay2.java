package com.nowcoder.offer.problem34;

public class UglyNumberWay2 {
	public int getUglyNumber(int n) {
		if (n <= 0) {
			return 0;
		}
		int[] uglyArr = new int[n];
		uglyArr[0] = 1;
		int m2 = 1, m3 = 1, m5 = 1;

		for (int i = 1; i < uglyArr.length; i++) {
			int min = Min(m2 * 2, m3 * 3, m5 * 5);
			uglyArr[i] = min;
			while (m2 * 2 <= min) {
				m2++;
			}
			while (m3 * 3 <= min) {
				m3++;
			}
			while (m5 * 5 <= min) {
				m5++;
			}
		}
		return uglyArr[n - 1];
	}

	int Min(int number1, int number2, int number3) {
		int min = (number1 < number2) ? number1 : number2;
		return min < number3 ? min : number3;
	}
}
