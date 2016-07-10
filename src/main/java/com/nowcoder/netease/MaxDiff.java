package com.nowcoder.netease;

/**
 * Created by taoxiaoran on 16/3/31.
 */

public class MaxDiff {
    // 寻找无序数组的最大差值 要求i < j,即前面减后面(a[i] - a[j])
    public void getMaxDiff(int[] a) {
        int s = 0;
        int maxDiff = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = a.length - 2; i >= 0; i--) {
            s = (s < 0) ? (a[i] - a[i+1]) : (a[i] - a[i+1] + s);
            if (maxDiff < s) {
                maxDiff = s;
                maxIndex = i;
            }
        }

        System.out.println("最大差值为:" + maxDiff);
        System.out.println("对应的两个元素为:");
        System.out.println("第一个元素是数组中第" + maxIndex + "元素:" + a[maxIndex]);
        for (int i = maxIndex + 1; i < a.length; i++) {
            if (a[maxIndex] - a[i] == maxDiff) {
                System.out.println("第二个元素是数组中第" + i + "元素:" + a[i]);
            }
        }
    }

    // 寻找无序数组的最大差值 要求后面减前面(a[j] - a[i])
    public void getMaxDiff2(int[] a) {
        int s = 0;
        int maxDiff = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 1; i < a.length; i++) {
            s = (s < 0) ? (a[i] - a[i-1]) : (a[i] - a[i-1] + s);
            if (maxDiff < s) {
                maxDiff = s;
                maxIndex = i;
            }
        }

        System.out.println("最大差值为:" + maxDiff);
        System.out.println("对应的两个元素为:");
        System.out.println("第一个元素是数组中第" + maxIndex + "元素:" + a[maxIndex]);
        for (int i = maxIndex - 1; i >= 0; i--) {
            if (a[maxIndex] - a[i] == maxDiff) {
                System.out.println("第二个元素是数组中第" + i + "元素:" + a[i]);
            }
        }
    }
    // 测试
    public static void main(String[] args) {
        int[] a = {5,2,4,1};
        new MaxDiff().getMaxDiff(a);
        new MaxDiff().getMaxDiff2(a);
    }
}
