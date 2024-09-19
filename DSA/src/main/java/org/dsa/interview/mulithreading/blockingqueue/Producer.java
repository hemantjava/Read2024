package org.dsa.interview.mulithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private  BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            int value = 0;
            while (true){
                System.out.println("Producer: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
