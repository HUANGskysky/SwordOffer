package com.nowcoder.offer.problem23;

import java.util.LinkedList;
import java.util.Queue;

import com.nowcoder.offer.node.BTreeNode;

public class LevelTraverse {
	public void levelOrder(BTreeNode root) {
		if (root == null) {
			return;
		}
		Queue<BTreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			BTreeNode node = queue.poll();
			System.out.println(node.data);
			if (node.leftChild != null) {
				queue.offer(node.leftChild);
			}
			if (node.rightChild != null) {
				queue.offer(node.rightChild);
			}
		}
	}
}
