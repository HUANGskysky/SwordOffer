package com.nowcoder.offer.problem16;

import com.nowcoder.offer.node.ListNode;

public class ReverseList {
	public ListNode reverse(ListNode head) {
		if (head == null) {
			return null;
		}
		
		ListNode pre = null;
		ListNode cur = head;
		
		while (cur != null) {
			if (cur.next == null) {
				cur.next = pre;
				return cur;
			}
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		
		return cur;
	}
}
