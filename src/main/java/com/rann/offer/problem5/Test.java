package com.rann.offer.problem5;

import com.rann.offer.node.ListNode;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node1.next = node2;
        node2.next = node3;

        ReversePrintNode rpn = new ReversePrintNode();
        List<ListNode> list = rpn.print2(node1);
        for (ListNode node : list) {
            System.out.println(node.data);
        }
    }
}
