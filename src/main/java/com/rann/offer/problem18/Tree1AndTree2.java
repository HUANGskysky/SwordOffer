package com.rann.offer.problem18;

import com.rann.offer.node.BTreeNode;

/**
 * problem18 树的子结构
 *
 * @author lemonjing
 */
public class Tree1AndTree2 {

    /**
     * @param root1 主树
     * @param root2 目标树
     * @return
     */
    public boolean HasSubtree(BTreeNode root1, BTreeNode root2) {
        boolean flag = false;

        if (null != root1 && null != root2) {
            flag = isSubTree(root1, root2);
            if (!flag) {
                return HasSubtree(root1.leftChild, root2) || HasSubtree(root1.rightChild, root2);
            }
        }
        return flag;
    }

    private boolean isSubTree(BTreeNode root1, BTreeNode root2) {
        if (null == root2) {
            return true;
        }
        if (null == root1) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        } else {
            return isSubTree(root1.leftChild, root2.leftChild) && isSubTree(root1.rightChild, root2.rightChild);
        }
    }
}