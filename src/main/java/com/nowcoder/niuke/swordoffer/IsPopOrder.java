package com.nowcoder.niuke.swordoffer;

import java.util.Stack;

/**
 * Created by hztaoran on 2016/8/9.
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (null == pushA || null == popA || pushA.length <= 0 || popA.length <= 0 || pushA.length != popA.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }
}
