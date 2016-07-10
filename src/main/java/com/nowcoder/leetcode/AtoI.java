package com.nowcoder.leetcode;

/**
 * Created by taoxiaoran on 16/3/29.
 */
public class AtoI {
    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int total = 0;

        // 空串
        if (null == s || s.length() <= 0) {
            return 0;
        }

        // 前导空白
        while (s.charAt(index) == ' ' && index < s.length()) {
            index++;
        }

        // 符号
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '+') ? 1 : -1;
        }

        // 处理并控制溢出
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if ((total > Integer.MAX_VALUE/10) || (Integer.MAX_VALUE/10 == total && digit > Integer.MAX_VALUE%10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }

        return sign * total;
    }
}
