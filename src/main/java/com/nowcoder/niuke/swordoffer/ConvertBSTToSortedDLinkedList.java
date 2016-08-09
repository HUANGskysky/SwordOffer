package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/9.
 */
public class ConvertBSTToSortedDLinkedList {

    private TreeNode lastNode = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (null == pRootOfTree) {
            return null;
        }

        convertCore(pRootOfTree);
        while (null != lastNode && lastNode.left != null) {
            lastNode = lastNode.left;
        }

        return lastNode;
    }

    private void convertCore(TreeNode pRootOfTree) {
        if (null == pRootOfTree) {
            return;
        }

        TreeNode current = pRootOfTree;
        if (null != current.left) {
            convertCore(current.left);
        }
        current.left = lastNode;
        if (null != lastNode) {
            lastNode.right = current;
        }
        lastNode = current;
        if (null != current.right) {
            convertCore(current.right);
        }
    }
}
