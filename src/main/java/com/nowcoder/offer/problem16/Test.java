package com.nowcoder.offer.problem16;

import com.nowcoder.offer.node.ListNode;

public class Test {
	public static void main(String[] args) {
		ListNode head = new ListNode();
		ListNode second = new ListNode();
		ListNode third = new ListNode();
		ListNode forth = new ListNode();
		head.next = second;
		second.next = third;
		third.next = forth;
		
		head.data = 1;
		second.data = 2;
		third.data = 3;
		forth.data = 4;
		ReverseList test = new ReverseList();
		ListNode node = test.reverse(head);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
