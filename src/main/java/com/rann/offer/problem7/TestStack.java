package com.rann.offer.problem7;

public class TestStack {
	public static void main(String[] args) throws Exception {
		MyStack ms = new MyStack();
		System.out.println("添加的数为：" + ms.push(1));
		System.out.println("添加的数为：" + ms.push(2));
		System.out.println("弹出：" + ms.pop());
		System.out.println("添加的数为：" + ms.push(3));
		System.out.println("弹出：" + ms.pop());
	}
}
