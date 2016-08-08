package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class HasSubTree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;

        if (null != root1 && null != root2) {
            if (root1.val == root2.val) {
                flag = isSubTree(root1, root2);
            }
            if (!flag) {
                return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (null == root2) {
            return true;
        }
        if (null == root1) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        } else {
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }
    }
}
