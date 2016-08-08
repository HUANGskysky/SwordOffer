package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class MergeList {
    // 递归
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (null == list1) {
            return list2;
        }
        if (null == list2) {
            return list1;
        }

        ListNode newHead = null;
        if (list1.val <= list2.val) {
            newHead = list1;
            newHead.next = Merge(list1.next, list2);
        } else {
            newHead = list2;
            newHead.next = Merge(list1, list2.next);
        }

        return newHead;
    }

    // 非递归
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if (null == list1) {
            return list2;
        }
        if (null == list2) {
            return list1;
        }

        ListNode newHead = null;
        if (list1.val <= list2.val) {
            newHead = list1;
            list1 = list1.next;
        } else {
            newHead = list2;
            list2 = list2.next;
        }

        ListNode p = newHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        if (list1 != null) {
            p.next = list1;
        }
        if (list2 != null) {
            p.next = list2;
        }

        return newHead;
    }
}
