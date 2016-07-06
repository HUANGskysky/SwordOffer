package com.nowcoder.offer.problem18;

import com.nowcoder.offer.node.BTreeNode;

/**
 * problem18 树的子结构
 *
 * @author hztaoran
 */
public class Tree1AndTree2 {

    /**
     * @param root1 主树
     * @param root2 目标树
     * @return
     */
    public boolean isSubTree(BTreeNode root1, BTreeNode root2) {
        if (null == root2) {
            return true;
        } else if (null == root1) {
            return false;
        }
        boolean flag = false;
        if (root1 != null && root2 != null) {
            if (root1.data == root2.data) {
               flag = doesTree1HasTree2(root1, root2);
            }
            if (!flag) {
                return doesTree1HasTree2(root1.leftChild, root2) || doesTree1HasTree2(root1.rightChild, root2);
            }
        }

        return flag;
    }

    private boolean doesTree1HasTree2(BTreeNode root1, BTreeNode root2) {
        if (null == root2) {
            return true;
        } else if (null == root1) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        } else {
            return doesTree1HasTree2(root1.leftChild, root2.leftChild) && doesTree1HasTree2(root1.rightChild, root2.rightChild);
        }
    }
}