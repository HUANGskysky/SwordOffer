package com.nowcoder.didi;

import java.util.Scanner;

/**
 * Created by _NoThankYou on 2016/9/4.
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String hexString = input.substring(2);
            Integer val = Integer.parseInt(hexString, 16);
            System.out.println(Integer.toString(val));
        }
    }
}
