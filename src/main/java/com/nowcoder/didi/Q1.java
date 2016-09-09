package com.nowcoder.didi;

import java.util.Scanner;

/**
 * Created by _NoThankYou on 2016/9/4.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            System.out.println(sb.toString());
        }
    }
}
