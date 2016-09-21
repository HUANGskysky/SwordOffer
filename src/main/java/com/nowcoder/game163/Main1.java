package com.nowcoder.game163;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int s = sc.nextInt();
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int t = sc.nextInt();
            int count = 0;
            int totalS = v1 * t + v2 * t;
            count = (int)Math.ceil((totalS / s + 1) / 2.0);

            System.out.println(count);
        }
        sc.close();
    }
}
