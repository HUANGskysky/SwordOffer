package com.nowcoder.red;

import java.util.Arrays;
import java.util.*;
import java.util.*;

/**
 * Created by 哓哓 on 2016/9/24 0024.
 */
public class Main {
    public int[] move(int[] arr, int n, int k) {
        int index = k % n;
        int tmp = 0;
        for (int i = 0; i < index; i++) {
            tmp = arr[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = tmp;
        }

        return arr;
    }
}
