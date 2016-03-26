package com.nowcoder.offer.problem21;

import java.util.Stack;

public class StackWithMin {
	private Stack<Integer> dataStack = new Stack<>();
	private Stack<Integer> auxStack = new Stack<>();
	
	public void push(Integer item) {
		dataStack.push(item);
		if (auxStack.size() == 0 || item <= auxStack.peek()) {
			auxStack.push(item);
		} else {
			auxStack.push(auxStack.peek());
		}
	}

	public Integer pop() {
		auxStack.pop();
		return dataStack.pop();
	}
	
	public Integer min() {
		return auxStack.peek();
	}
}
