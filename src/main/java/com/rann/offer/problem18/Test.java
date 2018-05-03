package com.rann.offer.problem18;

import com.rann.offer.node.BTreeNode;

public class Test {
    public static void main(String args[]) {
        BTreeNode root1 = new BTreeNode();
        BTreeNode node1 = new BTreeNode();
        BTreeNode node2 = new BTreeNode();
        BTreeNode node3 = new BTreeNode();
        BTreeNode node4 = new BTreeNode();
        BTreeNode node5 = new BTreeNode();
        BTreeNode node6 = new BTreeNode();
        root1.leftChild = node1;
        root1.rightChild = node2;
        node1.leftChild = node3;
        node1.rightChild = node4;
        node4.leftChild = node5;
        node4.rightChild = node6;
        root1.data = 8;
        node1.data = 7;
        node2.data = 2;
        node3.data = 9;
        node4.data = 2;
        node5.data = 4;
        node6.data = 7;
        BTreeNode root2 = new BTreeNode();
        BTreeNode a = new BTreeNode();
        BTreeNode b = new BTreeNode();
        root2.leftChild = a;
        root2.rightChild = b;
        root2.data = 8;
        a.data = 7;
        b.data = 2;
        Tree1AndTree2 tat = new Tree1AndTree2();
        System.out.println("==============");
        System.out.println(tat.HasSubtree(root1, root2));

    }
}
