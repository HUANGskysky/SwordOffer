package com.nowcoder.offer.problem15;

import com.nowcoder.offer.node.ListNode;

public class FindKthToTail {
	/*
	 * 输入一个链表，输出该链表的倒数第K个结点
	 */
	public ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;

		ListNode p = head;

		for (int i = 0; i < k - 1; i++) {
			if (p.next != null)
				p = p.next;
			else {
				return null;
			}
		}
		ListNode q = head;
		while (p.next != null) {
			p = p.next;
			q = q.next;
		}
		return q;
	}
}
