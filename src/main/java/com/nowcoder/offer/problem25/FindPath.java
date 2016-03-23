package com.nowcoder.offer.problem25;

import java.util.Stack;

import com.nowcoder.offer.node.BTreeNode;

public class FindPath {
	/**
	 * 输入一个二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
	 */
	public void findPath(BTreeNode root, int k) {
		if (root == null) {
			return;
		}
		Stack<Integer> stack = new Stack<>();
		findPath(root, k, stack);
	}
	
	private void findPath(BTreeNode root, int k, Stack<Integer> stack) {
		if (null == root) {
			return;
		}
		if (root.leftChild == null && root.rightChild == null) {
			if (root.data == k) {
				System.out.println("路径开始");
				for (int i : stack) {
					System.out.println(i);
				}
				System.out.println(root.data);
			}
		} else {
			stack.push(root.data);
			findPath(root.leftChild, k - root.data, stack);
			findPath(root.rightChild, k - root.data, stack);
			stack.pop();
		}
	}

}	
