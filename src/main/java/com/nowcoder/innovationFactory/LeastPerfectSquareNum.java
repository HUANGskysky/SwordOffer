package com.nowcoder.innovationFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by _NoThankYou on 2016/8/26.
 */
public class LeastPerfectSquareNum {
    public int get(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (isSquareNum(i)) {
                arr[i] = 1;
                continue;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i / 2; j++) {
                list.add(arr[j] + arr[i - j]);
            }

            arr[i] = minInList(list);
        }

        return arr[n];
    }

    private int minInList(List<Integer> list) {
        int min = list.get(0);
        for (int val : list) {
            if (val < min) {
                min = val;
            }
        }

        return min;
    }

    private boolean isSquareNum(int n) {
        int val = (int) Math.sqrt(n);
        if (n == val * val) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeastPerfectSquareNum().get(1));
        System.out.println(new LeastPerfectSquareNum().get(2));
        System.out.println(new LeastPerfectSquareNum().get(3));
        System.out.println(new LeastPerfectSquareNum().get(4));
        System.out.println(new LeastPerfectSquareNum().get(5));
        System.out.println(new LeastPerfectSquareNum().get(6));
        System.out.println(new LeastPerfectSquareNum().get(7));
        System.out.println(new LeastPerfectSquareNum().get(8));
        System.out.println(new LeastPerfectSquareNum().get(9));
        System.out.println(new LeastPerfectSquareNum().get(10));
        System.out.println(new LeastPerfectSquareNum().get(11));
        System.out.println(new LeastPerfectSquareNum().get(12));

    }
}
