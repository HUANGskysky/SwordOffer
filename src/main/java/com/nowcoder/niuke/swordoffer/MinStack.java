package com.nowcoder.niuke.swordoffer;

import org.apache.commons.codec.binary.Base64;

import java.util.Stack;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class MinStack {

    private Stack<Integer> dataStack = new Stack<>();

    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || node < minStack.peek() ) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        minStack.pop();
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
