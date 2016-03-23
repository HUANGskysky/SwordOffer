package com.nowcoder.offer.problem17;

import com.nowcoder.offer.node.ListNode;

/*
 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
 */
public class MergeList {
	public ListNode merge(ListNode root1, ListNode root2) {
		if (null == root1) {
			return root2;
		} else if (null == root2) {
			return root1;
		}
		
		ListNode newHead = null;
		
		if (root1.data <= root2.data) {
			newHead = root1;
			newHead.next = merge(root1.next, root2);
		} else {
			newHead = root2;
			newHead.next = merge(root1, root2.next);
		}
		
		return newHead;
	}
}
