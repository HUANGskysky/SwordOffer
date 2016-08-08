package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/8.
 */
public class JumpFloor2 {
    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }

        return (int)Math.pow(2, target - 1);
    }
}
