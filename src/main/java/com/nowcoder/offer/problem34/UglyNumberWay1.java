package com.nowcoder.offer.problem34;

public class UglyNumberWay1 {
	public int getUglyNumber(int index) {
		if (index <= 0) {
			return 0;
		}
		int number = 0;
		int uglyIndex = 0;
		while (uglyIndex < index) {
			number++;
			if (isUgly(number)) {
				uglyIndex++;
			}
		}
		return number;
	}
	
	private boolean isUgly(int number) {
		while (number % 2 == 0) {
			number /= 2;
		}
		while (number % 3 == 0) {
			number /= 3;
		}
		while (number % 5 == 0) {
			number /= 5;
		}
		
		return (1 == number) ? true : false;
	}
}
