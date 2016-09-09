package com.nowcoder.offer;

/**
 * Created by _NoThankYou on 2016/8/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Float f1 = stringToFloat("123");
        Float f2 = stringToFloat("123.0");


        System.out.println(f1);
        System.out.println(f2);

    }

    private static Float stringToFloat(String s) throws Exception {
        int total = 0;
        int sign = 1;
        int index = 0;

        // handle spaces
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                index++;
            } else if (index == s.length() - 1){
                throw new Exception("cast error");
            } else {
                break;
            }
        }

        // handle pre-zero
        while (index < s.length()) {
            if (s.charAt(index) == '0') {
                index++;
            } else if (index == s.length() - 1) {
                return 0.0f;
            } else {
                break;
            }
        }

        // handle sign
        if (s.charAt(index) == '+') {
            sign = 1;
        } else if (s.charAt(index) == '-') {
            sign = -1;
        }


        int firstIndex = s.indexOf('.');
        int lastIndex = s.lastIndexOf('.');

        // position of '.'
        int point = 0;
        if (-1 != firstIndex && -1 != lastIndex && firstIndex != lastIndex) {
            // more than 1 '.' symbol
            throw new Exception("error");
        } else if (firstIndex == lastIndex && firstIndex != -1) {
            // 1 '.'
            point = firstIndex;
        }

        int digit = 0;
        // input string has a '.'
        StringBuilder sb;
        if (0 != point) {
            String s2 = s.substring(0, point);
            for (int i = index; i < s2.length(); i++) {
                digit = s2.charAt(index) - '0';
                if (Integer.MAX_VALUE / 10 < total ||
                        (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)) {
                    if (sign == 1)
                        total = Integer.MAX_VALUE;
                    else
                        total = Integer.MIN_VALUE;
                    break;
                } else {
                    total = total * 10 + digit;
                }
            }
            sb = new StringBuilder();
            if (total == Integer.MAX_VALUE) {
                sb.append(String.valueOf(Integer.MAX_VALUE)).append('.').append('0');
                return Float.parseFloat(sb.toString());
            } else if (total == Integer.MIN_VALUE) {
                sb.append(String.valueOf(Integer.MIN_VALUE)).append('.').append('0');
                return Float.parseFloat(sb.toString());
            }

            sb.append(String.valueOf(total * sign));
            sb.append(s.substring(point, s.length()));
        } else {
            while (index < s.length()) {
                digit = s.charAt(index) - '0';
                if (digit < 0 || digit > 9) {
                    throw new Exception("cast error");
                }
                if (Integer.MAX_VALUE / 10 < total ||
                        (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)) {
                    if (sign == 1)
                        total = Integer.MAX_VALUE;
                    else
                        total = Integer.MIN_VALUE;
                    break;
                } else {
                    total = total * 10 + digit;
                }
                index++;
            }
            sb = new StringBuilder(String.valueOf(total * sign));
            sb.append(".0");

        }

        return Float.parseFloat(sb.toString());
    }
}
