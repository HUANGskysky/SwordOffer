package com.ryan.offer.problem14;

public class Test {
	public static void main(String[] args) {
		Reorder r = new Reorder();
		int[] a = {1,2,3,4,5,6};
		r.order(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
