package com.nowcoder.offer.problem22;

import java.util.Stack;

public class IsPopOrder {
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
