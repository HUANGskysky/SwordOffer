package com.nowcoder.cmbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/12 0012.
 */
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(reverse(reverse(x) + reverse(y)));
        }
        sc.close();
    }

    public static int reverse(int x) {
        int res = 0;
        while (x > 0) {
            res *= 10;
            res += x % 10;
            if (res > Integer.MAX_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return res;
    }
}
