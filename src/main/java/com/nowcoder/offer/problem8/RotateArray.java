package com.nowcoder.offer.problem8;

/**
 * 求旋转数组的最小元素
 * @author 哓哓
 *
 */
public class RotateArray {
	public Integer min(int[] a) {
		if (null == a || a.length < 1) {
			return null;
		}
		int low = 0;
		int high = a.length-1;
		int mid = low;
		while (a[low] >= a[high]) {
			if (high - low <=1) {
				mid = high;
				break;
			}
			mid = (low+high)/2;
			if (a[low] == a[high] && a[low] == a[mid]) {
				if (a[low+1] != a[high-1]) {
					mid = (a[low+1] < a[high-1]) ? low+1 : high-1;
					break;
				} else {
					low++;
					high--;
				}
			} else {
				if (a[mid] >= a[low]) {
					low = mid;
				} else if (a[mid] <= a[high]) {
					high = mid;
				}
			}
		}
		
		return a[mid];
	}
}
