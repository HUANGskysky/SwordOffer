package com.nowcoder.offer.problem19;

import java.util.Stack;

import com.nowcoder.offer.node.BTreeNode;

public class MirrorOfTree {
	public BTreeNode mirror(BTreeNode root) {
		if (null == root) {
			return null;
		}
		BTreeNode node = root;
		Stack<BTreeNode> stack = new Stack<>();
		
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				BTreeNode temp = node.leftChild;
				node.leftChild = node.rightChild;
				node.rightChild = temp;
				stack.push(node);
				node = node.leftChild;
			}
			node = stack.pop();
			node = node.rightChild;
		}
		
		return root;
	}
}
