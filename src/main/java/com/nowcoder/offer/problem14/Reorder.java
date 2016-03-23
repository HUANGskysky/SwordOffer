package com.nowcoder.offer.problem14;

public class Reorder {
	public void order(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		int low = 0;
		int high = a.length - 1;
		
		while (low < high) {
			while (low < high && (a[high] & 1) == 0) {
				high--;
			}
			while (low < high && (a[low] & 1) != 0) {
				low++;
			}
			if (low < high) {
				int temp = a[high];
				a[high] = a[low];
				a[low] = temp;
			}
		}
		return;
	}
}
