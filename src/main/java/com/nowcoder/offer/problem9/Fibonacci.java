package com.nowcoder.offer.problem9;

/**
 * 斐波那契数列
 */
public class Fibonacci {
	public int fibRecursive(int n) {
		if (n <= 0) {
			return 0;
		}
		if (1 == n) {
			return 1;
		}
		
		return fibRecursive(n-1) + fibRecursive(n-2);
	}
	
	public int fib(int n) {
		int res[] = {0, 1};
		if (n < 2) {
			return res[n];
		}
		int fib1 = 1;
		int fib2 = 0;
		int fibN = 0;
		for (int i = 2; i <= n; i++) {
			fibN = fib1 + fib2;
			fib2 = fib1;
			fib1 = fibN;
		}
		
		return fibN;
	}
}
