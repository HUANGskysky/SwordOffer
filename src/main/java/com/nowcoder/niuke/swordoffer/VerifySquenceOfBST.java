package com.nowcoder.niuke.swordoffer;

import java.util.Arrays;

/**
 * Created by hztaoran on 2016/8/9.
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (null == sequence || sequence.length <= 0) {
            return false;
        }

        int root = sequence[sequence.length - 1];

        int i = 0;
        for (; i < sequence.length - 1; i++) {
            if (sequence[i] > root) {
                break;
            }
        }

        int j = i;
        for (; j < sequence.length - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }

        boolean left = true;
        if (i > 0) {
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        }

        boolean right = true;
        if (i < sequence.length - 1) {
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length - 1));
        }

        return left && right;
    }
}
