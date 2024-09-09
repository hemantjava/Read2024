package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class OddAndEvenMultiThreading {
    public static void main(String[] args) {
        final int maxNum = 20;
        printOddAndEvenNumber(maxNum);
    }

    private static void printOddAndEvenNumber(int maxNum) {
        CompletableFuture oddFuture = CompletableFuture.runAsync(()->{
            IntStream.rangeClosed(1, maxNum)
                    .filter(num -> num%2 != 0)
                    .forEach(num -> {
                        System.out.println(num+": Odd");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    });
        });
        CompletableFuture evenFuture = CompletableFuture.runAsync(()->{
            IntStream.rangeClosed(1, maxNum)
                    .filter(num -> num%2 == 0)
                     .forEach(num -> {
                         System.out.println(num+": Even");
                         try {
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             throw new RuntimeException(e);
                         }
                     });
        });
        CompletableFuture<Void> allOf = CompletableFuture.allOf(oddFuture,evenFuture);
        allOf.join();
    }

    private static ExecutorService getThead(String name) { //Optional
        return Executors.newSingleThreadExecutor(thread -> {
            Thread t = new Thread(thread);
            t.setName(name);
            return t;
        });
    }
}
