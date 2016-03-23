package com.nowcoder.offer.problem19;

import com.nowcoder.offer.node.BTreeNode;

public class Test {
	public static void main(String[] args) {
		BTreeNode node1 = new BTreeNode();
		BTreeNode node2 = new BTreeNode();
		BTreeNode node3 = new BTreeNode();
		node1.leftChild = node2;
		node1.rightChild = node3;
		node1.data = 1;
		node2.data = 2;
		node3.data = 3;
		MirrorOfTree mot = new MirrorOfTree();
		BTreeNode root = mot.mirror(node1);
		System.out.println(root.data + " " + root.leftChild.data + " " + root.rightChild.data);
	}
}
