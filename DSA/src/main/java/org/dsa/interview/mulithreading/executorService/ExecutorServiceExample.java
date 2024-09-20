package org.dsa.interview.mulithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 30; i++) {
            int finalI = i;
            executorService.execute(()-> System.out.println(finalI + "  Running:" + Thread.currentThread().getName()));
        }
        executorService.shutdown();

    }

}
