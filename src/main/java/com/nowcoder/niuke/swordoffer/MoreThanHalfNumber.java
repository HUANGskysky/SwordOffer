package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/12.
 */
public class MoreThanHalfNumber {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (null == array || array.length <= 0) {
            return 0;
        }

        int number = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (0 == count) {
                number = array[i];
                count = 1;
            } else if (number == array[i]) {
                count++;
            } else {
                count--;
            }
        }

        if (checkMoreThanHalf(array, number)) {
            return number;
        }
        return 0;
    }

    private boolean checkMoreThanHalf(int[] a, int number) {
        int times = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                times++;
            }
        }

        if (2 * times > a.length) {
            return true;
        }

        return false;
    }
}
