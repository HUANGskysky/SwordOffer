package com.nowcoder.iqiyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(",");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < str.length; i++) {
                list.add(Integer.parseInt(str[i]));
            }

        }
        sc.close();
    }

}

