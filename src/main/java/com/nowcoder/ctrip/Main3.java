package com.nowcoder.ctrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(",");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < str.length; i++) {
                list.add(Integer.parseInt(str[i]));
            }
            System.out.println(getMaxValue(list));
        }
        sc.close();
    }

    public static int getMaxValue(List<Integer> list) {
        if (list.size() < 2) {
            return 0;
        }
        int maxValue = 0;
        int current = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            current = Math.min(current, list.get(i));
            maxValue = Math.max(maxValue, list.get(i) - current);
        }

        return maxValue;
    }
}