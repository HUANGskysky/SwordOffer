package com.nowcoder.offer.problem13;

import com.nowcoder.offer.node.ListNode;

public class DeleteNode {
	
	/*
	 * 给定单向链表的头指针和一个节点，定义一个函数在O(1)时间删除该节点
	 */
	public void deleteNode(ListNode head, ListNode node) {
		if (null == node || null == head) {
			return;
		}
		if (head == node) {
			head = null;
		} else {
			if (node.next == null) {
				ListNode p = head;
				while (p.next.next != null) {
					p = p.next;
				}
				p.next = null;
			} else {
				node.data = node.next.data;
				node.next = node.next.next;
			}
		}
	}
}
