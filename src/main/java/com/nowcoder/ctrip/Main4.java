package com.nowcoder.ctrip;

import java.util.Scanner;

public class Main4 {
    public static int halfSearch(int[] a, int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < a[mid]) {
                high = mid - 1;
            } else if (x > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1-low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line1 = sc.nextLine();
            int x = Integer.parseInt(line1);

            String line2 = sc.nextLine();
            int n = Integer.parseInt(line2);

            String line3 = sc.nextLine();
            String[] str = line3.split(" ");
            int[] num = new int[n];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            System.out.println(halfSearch(num, 0, num.length -1, x));
        }
        sc.close();
    }
}
