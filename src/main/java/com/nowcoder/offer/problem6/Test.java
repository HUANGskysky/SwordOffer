package com.nowcoder.offer.problem6;

import com.nowcoder.offer.node.BTreeNode;

public class Test {
	public static void main(String[] args) throws Exception {
		ConstructBTree cb = new ConstructBTree();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		BTreeNode root = cb.construct(pre, in);
		System.out.println(root.data);
	}
}
