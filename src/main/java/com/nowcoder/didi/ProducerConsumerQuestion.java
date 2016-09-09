package com.nowcoder.didi;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by 哓哓 on 2016/9/9 0009.
 */
public class ProducerConsumerQuestion {

    public static void main(String[] args) {
        BlockingQueue<String> queue =  new ArrayBlockingQueue<>(2);

        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);

        new Thread(c, "消费者线程").start();
        new Thread(p, "生产者线程").start();
    }
}

class Producer implements Runnable {

    BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String data = "数据" + (i+1);
            try {
                System.out.println("生产者将" + data + "放入缓冲区");
                queue.put(data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String data = queue.take();
                System.out.println("消费者消费" + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
