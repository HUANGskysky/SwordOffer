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
		dn.deleteNode(a, c);
		System.out.println(a.next.next);
	}
}
