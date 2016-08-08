package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int [] array) {
        if (null == array || array.length <= 0) {
            return 0;
        }

        int low = 0;
        int mid = low;
        int high = array.length - 1;

        while (array[low] >= array[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }

            mid = (low + high) / 2;
            if (array[low] == array[mid] && array[mid] == array[high]) {
                return getMinInOrder(array, low, high);
            }

            if (array[low] <= array[mid]) {
                low = mid;
            } else if (array[mid] <= array[high]) {
                high = mid;
            }
        }

        return array[mid];
    }

    private int getMinInOrder(int[] array, int low, int high) {
        int res = array[low];
        for (int i = low; i <= high; i++) {
            if (array[i] < res) {
                res = array[i];
            }
        }

        return res;
    }

}
