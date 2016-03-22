package com.nowcoder.offer.problem7;

public class Test {
	public static void main(String[] args) throws Exception {
		MyQueue queue = new MyQueue();
		queue.appendTail(1);
		queue.appendTail(2);
		System.out.println(queue.deleteHead());
	}
}
