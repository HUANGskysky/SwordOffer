package com.nowcoder.youku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by 哓哓 on 10/15/2016.
 */
public class Main1 {



    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//            String[] str = line.split(" ");
//            List<String> list = new ArrayList<>();
//            for (int i = 0; i < str.length; i++) {
//                list.add(str[i]);
//            }
//
//        }
//        sc.close();
     int[] a = new int[5];
        System.out.println(a[5]);
    }
}

class base {
    public void foo() {
        System.out.println("base foo");
    }
}

class sub extends base {
    public void foo() {
        System.out.println("sub foo");
    }
}
