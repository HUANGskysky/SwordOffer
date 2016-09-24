package com.nowcoder.didi;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in, "UTF-8");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] str = line.split(" ");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i<str.length; i++) {
                list.add(Integer.parseInt(str[i]));
            }
            int[] count = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                int cur = list.get(i);
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(j) < cur) {
                        count[i]++;
                    }
                }
            }
            System.out.println(Arrays.toString(count));
        }
    }
}


