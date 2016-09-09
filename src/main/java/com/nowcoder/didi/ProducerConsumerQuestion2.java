package com.nowcoder.didi;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * wait/notify实现
 */
public class ProducerConsumerQuestion2 {

    public static void main(String[] args) {
        BufferZone bufferZone = new BufferZone();

        Producer2 p = new Producer2(bufferZone);
        Consumer2 c = new Consumer2(bufferZone);

        new Thread(c, "消费者线程").start();
        new Thread(p, "生产者线程").start();
    }
}

class BufferZone {

    private int maxSize;

    private List<Date> buffer;

    public BufferZone() {
        maxSize = 2;
        buffer = new LinkedList<>();
    }

    // 对应生产者
    public synchronized void set() {
        while (buffer.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(new Date());
        System.out.println("生产者生产了1件商品，此时缓冲区大小为" + buffer.size());
        notifyAll();
    }

    // 对应消费者
    public synchronized void get() {
        while (buffer.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费" + ((LinkedList<?>) buffer).poll()
                + "此时缓冲区大小为" + buffer.size());
        notifyAll();
    }
}

class Producer2 implements Runnable {

    private BufferZone bufferZone;

    public Producer2(BufferZone bufferZone) {
        this.bufferZone = bufferZone;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            bufferZone.set();
        }
    }
}

class Consumer2 implements Runnable {

    private BufferZone bufferZone;

    public Consumer2(BufferZone bufferZone) {
        this.bufferZone = bufferZone;
    }

    @Override
    public void run() {
      for (int i = 0; i < 5; i++) {
          bufferZone.get();
      }
    }
}
