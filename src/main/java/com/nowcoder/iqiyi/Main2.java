//package com.nowcoder.iqiyi;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String line1 = sc.nextLine();
//            String[] str = line1.split(" ");
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < str.length; i++) {
//                list.add(Integer.parseInt(str[i]));
//            }
//
//        }
//        sc.close();
//    }
//
//    public static int getValue(List<Integer> list) {
//        if (1 == list.get(0)) {
//            total += (list.get(2) - list.get(1) + 1) * list.get(3);
//        } else if (2 == list.get(0)) {
//            total += list.get(2);
//        } else {
//            return total;
//        }
//
//        return total;
//    }
//
//}
