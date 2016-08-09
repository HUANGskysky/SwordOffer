package com.nowcoder.niuke.swordoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hztaoran on 2016/8/9.
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if (null == root) {
            return list;
        }

        Stack<Integer> stack = new Stack<>();
        core(list, stack, root, target);

        return list;
    }

    private void core(ArrayList<ArrayList<Integer>> list, Stack<Integer> stack, TreeNode root, int target) {
        if (null == root) {
            return;
        }

        if (null == root.left && null == root.right) {
            if (root.val == target) {
                ArrayList<Integer> tmpList = new ArrayList<>();
                for (int i : stack) {
                    tmpList.add(i);
                }
                tmpList.add(root.val);
                list.add(tmpList);
            }
        } else {
            stack.push(root.val);
            core(list, stack, root.left, target - root.val);
            core(list, stack, root.right, target - root.val);
            stack.pop();
        }
    }
}
