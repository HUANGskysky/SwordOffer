package com.rann.offer.problem16;

import com.rann.offer.node.ListNode;

/**
 * problem16
 * 反转链表
 * @author lemonjing
 *
 */
public class ReverseList {

    public ListNode reverse(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
//            if (cur.next == null) {
//                cur.next = pre;
//                return cur;
//            }
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }
}
