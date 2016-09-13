package com.nowcoder.alibaba;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 赐除掉重复连续的字符
 *
 * @author hanshibo
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {7, 6, 5, 4, 3, 2, 1};
        get(a);
        System.out.println(Arrays.toString(a));
    }

    public static void get(int[] a) {
        Arrays.sort(a);
        int j = 1;
        for (int i = 0; i < a.length; i += 2) {
            swap(a, i, j);
            j++;
        }

        for (int i = a.length - 1; i >= 0; i -= 2) {
            swap(a, i, j);
            j++;
        }

        return;
    }

    public static void swap(int[] a, int begin, int end) {
        int temp = a[begin];
        a[begin] = a[end];
        a[end] = temp;
    }
}


