package com.nowcoder.offer.problem22;

import java.util.Stack;

public class IsPopOrder {
	/*
	 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
	 * 假设压入栈的所有数字均不相等。
	 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
	 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
	 */
	public boolean isPopOrder(int[] line1, int[] line2) {
		if (line1 == null || line2 == null) {
			return false;
		}
		int pos = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < line2.length; i++) {
			if (!stack.isEmpty() && stack.peek() == line2[i]) {
				stack.pop();
			} else {
				if (pos == line1.length) {
					return false;
				} else {
					do {
						stack.push(line1[pos++]);
					} while (stack.peek() != line2[i] && pos != line1.length);
					if (stack.peek() == line2[i]) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
}
