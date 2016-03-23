package com.nowcoder.offer.problem17;

import com.nowcoder.offer.node.ListNode;

public class Test {
	public static void main(String args[]) {
		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		a1.next = a2;
		a1.data = 1;
		a2.data = 5;

		ListNode b1 = new ListNode();
		ListNode b2 = new ListNode();
		ListNode b3 = new ListNode();
		b1.next = b2;
		b2.next = b3;
		b1.data = 2;
		b2.data = 3;
		b3.data = 4;

		MergeList ml = new MergeList();
		ListNode node = ml.merge(a1, b1);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
