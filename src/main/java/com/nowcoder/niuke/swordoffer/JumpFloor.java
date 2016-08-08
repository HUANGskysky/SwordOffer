package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }

        if (target == 1 || target == 2) {
            return target;
        }

        int fib1 = 1;
        int fib2 = 2;
        int fibN = 0;
        for (int i = 3; i <= target; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }

        return fibN;
    }
}
