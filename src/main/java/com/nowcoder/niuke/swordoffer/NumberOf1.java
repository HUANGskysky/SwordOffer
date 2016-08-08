package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class NumberOf1 {
    public int  NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = (n-1) & n;
            count++;
        }

        return count++;
    }
}
