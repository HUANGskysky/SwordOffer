package com.nowcoder.offer.problem5;

import java.util.Stack;

import com.nowcoder.offer.node.ListNode;

/**
 * 从尾到头打印单链表
 * @author 哓哓
 *
 */
public class ReversePrintNode {
	public void print(ListNode head) {
		if (head == null) {
			return;
		}
		Stack<ListNode> stack = new Stack<>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().data);
		}
	}
}
