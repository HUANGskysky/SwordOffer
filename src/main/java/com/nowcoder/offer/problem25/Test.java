package com.nowcoder.offer.problem25;

import com.nowcoder.offer.node.BTreeNode;

public class Test {
	public static void main(String[] args) {
		BTreeNode root1 = new BTreeNode();
		BTreeNode node1 = new BTreeNode();
		BTreeNode node2 = new BTreeNode();
		root1.leftChild = node1;
		root1.rightChild = node2;
		root1.data = 1;
		node1.data = 2;
		node2.data = 2;
		FindPath testFindPath = new FindPath();
		testFindPath.findPath(root1, 5);

	}
}
