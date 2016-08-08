package com.nowcoder.niuke.swordoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hztaoran on 2016/8/4.
 */
public class PrintListFromTailToHead {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();

        if (null == listNode) {
            return list;
        }

        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();

        if (null == listNode) {
            return list;
        }

        recursivePrint(list, listNode);

        return list;
    }

    private void recursivePrint(ArrayList<Integer> list, ListNode head) {
        if (null != head) {
            if (null != head.next) {
                recursivePrint(list, head.next);
            }
            list.add(head.val);
        }
    }

}