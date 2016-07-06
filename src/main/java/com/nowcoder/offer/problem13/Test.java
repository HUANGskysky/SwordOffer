package com.nowcoder.offer.problem13;

import com.nowcoder.offer.node.ListNode;

public class Test {
	public static void main(String args[]) {
		ListNode a = new ListNode();
		ListNode b = new ListNode();
		ListNode c = new ListNode();
		a.next = b;
		b.next = c;
		a.data = 1;
		b.data = 2;
		c.data = 3;
		DeleteNode dn = new DeleteNode();
		ListNode head = dn.deleteNode(a, a);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
