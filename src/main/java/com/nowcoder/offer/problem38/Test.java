package com.nowcoder.offer.problem38;

public class Test {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 6, 7 };
		GetNumberOfSortedArray test = new GetNumberOfSortedArray();
		System.out.println(test.getNumberOfK(a, 1));
		System.out.println(test.getNumberOfK(a, 2));
		System.out.println(test.getNumberOfK(a, 5));
		System.out.println(test.getNumberOfK(a, 6));
		System.out.println(test.getNumberOfK(a, 7));
	}
}
