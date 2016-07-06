package com.nowcoder.offer.problem15;

import com.nowcoder.offer.node.ListNode;

public class Test {
	public static void main(String args[])
	{
		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a3 = new ListNode();
		ListNode a4 = new ListNode();
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a1.data = 1;
		a2.data = 2;
		a3.data = 3;
		a4.data = 4;
		FindKthToTail fkt = new FindKthToTail();
		ListNode node = fkt.findKthOfTail(a1, 4);
		System.out.println(node.data);
	}
}
