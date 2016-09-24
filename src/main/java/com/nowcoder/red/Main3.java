package com.nowcoder.red;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/24 0024.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] str = line.split(" ");
            List<String> list = new ArrayList<>();
            for (int i = 0; i < str.length; i++) {
                list.add(str[i]);
            }

        }
        sc.close();
    }
}
