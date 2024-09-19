package org.dsa.interview.mulithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {
    public static void main(String[] args) {
        //Create BlockingQueue with capacity 5
        BlockingQueue<Integer> queue =  new ArrayBlockingQueue<>(5);
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        //start the threads
        consumerThread.start();
        producerThread.start();

    }
}
