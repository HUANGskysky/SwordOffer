package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        if (null == array || array.length <= 0) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                // 暂存当前值
                int temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] % 2 == 0) {
                    array[j+1] = array[j];
                    j--;
                }
                // 当前值归位
                array[j+1] = temp;
            }
        }
    }
}
