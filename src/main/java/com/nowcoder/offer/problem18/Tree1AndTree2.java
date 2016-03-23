package com.nowcoder.offer.problem18;

import com.nowcoder.offer.node.BTreeNode;

public class Tree1AndTree2 {
	public boolean hasSubTree(BTreeNode root1, BTreeNode root2) {
		if (null == root2) {
			return true;
		}
		if (null == root1) {
			return false;
		}
		boolean flag = false;
		if (root1!=null && root2!=null) {
			if (root1.data == root2.data) {
				flag = doesTree1HaveTree2(root1, root2);
			}
			if (!flag) {
				return hasSubTree(root1.leftChild, root2) || hasSubTree(root1.rightChild, root2);
			}
		}
		return flag;
	}
	
	
	private boolean doesTree1HaveTree2(BTreeNode root1, BTreeNode root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.data != root2.data) {
			return false;
		} else {
			return doesTree1HaveTree2(root1.leftChild, root2.leftChild) && doesTree1HaveTree2(root1.rightChild, root2.rightChild);
		}
 	}
}
