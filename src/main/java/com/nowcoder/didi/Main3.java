package com.nowcoder.didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by _NoThankYou on 2016/9/8.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(50);

        final List<Integer> list = new ArrayList<>();

        final Random r = new Random();

        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    list.add(r.nextInt());
                    latch.countDown();
                }
            }).start();
        }

        latch.await();
        int sum = 0;
        for (int val : list) {
            sum += val;
        }
        System.out.println(sum);
    }
}
