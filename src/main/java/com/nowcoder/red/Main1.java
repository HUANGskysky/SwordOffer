package com.nowcoder.red;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 哓哓 on 2016/9/24 0024.
 */
public class Main1 {
    public static void main(String[] args) {
        String str1 = "5+(2+7)*[2+{[4]}-3]";
        String str2 = "5+(2+7)*[2+{[4{]}-3]";
        System.out.println(new Main1().match(str1));
        System.out.println(new Main1().match(str2));
    }

    public boolean match(String str) {
        if (null == str || str.length() <= 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else if ((str.charAt(i) == ')' && stack.peek() == '(')
                    || (str.charAt(i) == ']' && stack.peek() == '[')
                    || (str.charAt(i) == '}' && stack.peek() == '{')) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
