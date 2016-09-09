package com.nowcoder.didi;

import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/6 0006.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            System.out.println(find(array));
//        }

        sc.close();
    }

    public static int find(int[] array) {
        int flag = 0x7fffffff;
        if (null == array || array.length <= 0) {
            return flag;
        }

        int res = array[0];
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum = (sum < 0) ? array[i] : (sum + array[i]);
            if (sum > res) {
                res = sum;
            }
        }

        return res;
    }
}
