package com.nowcoder.game163;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(" ");
            List<String> list = new ArrayList<>();
            for (int i = 0; i < str.length; i++) {
                list.add(str[i]);
            }

        }
        sc.close();
    }

    public static int get(List<String> list) {

        return 0;
    }
}
