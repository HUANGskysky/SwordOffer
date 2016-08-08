package com.nowcoder.niuke.swordoffer;

import java.util.Stack;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class Mirror {


    // 使用栈模拟
    public void Mirror(TreeNode root) {
        if (null == root) {
            return;
        }

        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (null != node) {
                stack.push(node);
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
    }

    // 递归
    public void Mirror2 (TreeNode root) {
        if (null == root) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror2(root.left);
        Mirror2(root.right);
    }

}
