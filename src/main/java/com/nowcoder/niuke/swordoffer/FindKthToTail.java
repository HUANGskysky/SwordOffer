package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (null == head || k <= 0) {
            return null;
        }

        ListNode p = head;
        for (int i = 0; i < k-1; i++) {
            if (p.next != null) {
                p = p.next;
            } else {
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
