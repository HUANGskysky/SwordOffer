package com.nowcoder.offer.problem31;

public class FindGreatestSum {
	/**
	 * 连续子数组的最大和 - 动态规划
	 * O(n)
	 * @param array
	 * @return
	 */
	public int findGreatestSumOfSubArrayWithDP(int[] array) {
		if (null == array || array.length <= 0) {
			return 0;
		}
		int res = array[0];
		int sum = array[0];
		for (int i = 1; i < array.length; i++) {
			sum = (sum < 0) ? array[i] : (sum + array[i]);
			if (sum > res) {
				res = sum;
			}
		}
		return res;
	}
	
	/**
	 * 分治O(nlgn)
	 * @param array
	 * @return
	 */
	public int findGreatestSumOfSubArray(int[] array) {
		if (null == array || array.length <= 0) {
			return 0;
		}
		return find(array, 0, array.length - 1);
	}
	
	private int find(int[] array, int left, int right) {
		int maxLeftSum = 0;
		int maxRightSum = 0;
		int maxLeftBorderSum = 0, maxRightBorderSum = 0;
		
		if (left == right) {
			if (array[left] > 0) {
				return array[left];
			} else {
				return 0;
			}
		}
		int mid = (left+right)/2;
		maxLeftSum = find(array, left, mid);
		maxRightSum = find(array, mid+1, right);
		
		int leftBorderSum = 0, rightBorderSum = 0;
		for (int i = mid; i >= left; i--) {
			leftBorderSum += array[i];
			if (leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			}
		}
		
		for (int i = mid + 1; i <= right; i++) {
			rightBorderSum += array[i];
			if (rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
			}
		}
		
		int max1 = (maxLeftSum > maxRightSum) ? maxLeftSum : maxRightSum;
		int max2 = maxLeftBorderSum + maxRightBorderSum;
		
		return max1 > max2 ? max1 : max2;
	}
}
