package com.nowcoder.offer.problem27;

import com.nowcoder.offer.node.BTreeNode;

/**
 * 将二叉搜索树转换为一个排序的双向链表
 * @author 哓哓
 *
 */
public class Convert {

    public BTreeNode convert(BTreeNode root) {
        if (null == root) {
            return null;
        }
        BTreeNode lastNode = null;
        convertNode(root, lastNode);
        while (null != lastNode && lastNode.leftChild != null) {
            lastNode = lastNode.leftChild;
        }
        return lastNode;
    }

    private void convertNode(BTreeNode root, BTreeNode lastNode) {
        if (null == root) {
            return;
        }
        BTreeNode current = root;
        if (null != current.leftChild) {
            convertNode(current.leftChild, lastNode);
        }
        current.leftChild = lastNode;
        if (null != lastNode) {
            lastNode.rightChild = current;
        }
        lastNode = current;
        if (null != current.rightChild) {
            convertNode(current.rightChild, lastNode);
        }
    }
}
