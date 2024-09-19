package org.dsa.interview.mulithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private  BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            Integer value = queue.take();//take a value from the queue
            System.out.println("Consumer: " + value);
            Thread.sleep(1000);
            queue.remove();

        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted");
        }

    }
}
