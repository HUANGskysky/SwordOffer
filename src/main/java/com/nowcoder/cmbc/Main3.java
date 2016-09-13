package com.nowcoder.cmbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/12 0012.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            System.out.println(find(list));
        }
        sc.close();
    }

    public static int find(List<Integer> list) {
        int res = 0;
        if (isPalindrome(list)) {
            return 0;
        } else {
            // 操作1 移除两个数后成为回文
            for (int i = 0; i < list.size() - 2; i++) {
                int num1 = list.get(i);
                int num2 = list.get(i+1);
                list.remove(i);
                list.remove(i+1);
                if (isPalindrome(list)) {
                    res += 1;
                } else {
                    list.add(i, num1);
                    list.add(i+1, num2);
                    continue;
                }
            }
        }

        return res + 1;
    }

    public static boolean isPalindrome(List<Integer> list) {
        if (list == null) return false;
        int begin = 0, end = list.size() - 1;
        while (begin < end) {
            if (list.get(begin++) != list.get(end--))
                return false;
        }
        return true;
    }
}
