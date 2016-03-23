package com.nowcoder.offer.problem29;

public class MoreThanHalfNumber {
	public Integer findNum(int[] a) {
		if (null == a) {
			return null;
		}
		
		int res = a[0];
		int count = 1;
		
		for (int i = 1; i < a.length; i++) {
			if (count == 0) {
				res = a[i];
				count = 1;
			} else if (a[i] == res) {
				count++;
			} else {
				count--;
			}
		}
		if (checkMoreThanHalf(a, res)) {
			return res;
		} else {
			return null;
		}
	}
	
	private boolean checkMoreThanHalf(int[] a, int num) {
		int times = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				times++;
			}
		}
		if (2*times <= a.length) {
			return false;
		} else {
			return true;
		}
	}
}
