package com.nowcoder.offer.problem40;

public class FindAppearOnce {
	public void find(int[] a) {
		if (null == a) {
			return;
		}
		int number = 0;
		for (int i : a) {
			number ^= i;
		}
		int index = findFirstBitIs1(number);
		int number1 = 0, number2 = 0;
		
		for (int i : a) {
			if (isBit1(i, index)) {
				number1 ^= i;
			} else {
				number2 ^= i;
			}
		}
		System.out.println(number1);
		System.out.println(number2);
	}
	
	// 找出number的二进制中最右边是1的位 
	private int findFirstBitIs1(int number) {
		int indexBit = 0;
		while ((number & 1) == 0) {
			number = number >> 1;
			++indexBit;
		}
		
		return indexBit;
	}
	
	// 判断number的二进制表示中从右边起的第indexBit位是不是1
	private boolean isBit1(int number, int indexBit) {
		number = number >> indexBit;
		
		return (number & 1) == 0;
	}
}
