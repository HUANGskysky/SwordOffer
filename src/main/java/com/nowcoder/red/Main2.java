package com.nowcoder.red;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 哓哓 on 2016/9/24 0024.
 */
public class Main2 {
    public static void main(String[] args) {
        String str1 = "5+(2+7)*(2+((4))-3)";
        String str2 = "5+(2+7)*(2+((4))-3";
        System.out.println(new Main2().match(str1));
        System.out.println(new Main2().match(str2));
    }

    public boolean match(String str) {
        if (null == str || str.length() <= 1) {
            return false;
        }

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                index++;
            } else if (str.charAt(i) == ')') {
                index--;
                if (index < 0) {
                    return false;
                }
            }
        }

        return index == 0;
    }

}
