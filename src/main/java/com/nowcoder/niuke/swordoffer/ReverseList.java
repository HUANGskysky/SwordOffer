package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }
}
