package com.nowcoder.offer.problem25;

import java.util.ArrayList;
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

	// 保存路径
	public ArrayList<ArrayList<Integer>> findPath2(BTreeNode root, int target) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if (null == root) {
			return list;
		}
		Stack<Integer> stack = new Stack<>();
		findPath2(root, target, stack, list);

		return list;
	}

	private void findPath2(BTreeNode root, int target, Stack<Integer> stack, ArrayList<ArrayList<Integer>> list) {
		if (null == root) {
			return;
		}
		if (root.leftChild == null && root.rightChild == null) {
			if (root.data == target) {
				ArrayList<Integer> tmpList = new ArrayList<>();
				for (int i : stack) {
					tmpList.add(i);
				}
				tmpList.add(root.data);
				list.add(tmpList);
			}
		} else {
			stack.push(root.data);
			findPath2(root.leftChild, target - root.data, stack, list);
			findPath2(root.rightChild, target - root.data, stack, list);
			stack.pop();
		}
	}
}
