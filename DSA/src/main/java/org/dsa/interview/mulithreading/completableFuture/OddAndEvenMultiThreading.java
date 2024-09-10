package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class OddAndEvenMultiThreading {
    public static void main(String[] args) {
        printOddAndEvenNumber1(20);
    }

    private static void printOddAndEvenNumber(int maxNum) {
        //One thread
        CompletableFuture<Void> oddFuture = CompletableFuture.runAsync(() -> IntStream.rangeClosed(1, maxNum)
                .filter(num -> num % 2 != 0)
                .forEach(num -> {

                    try {
                        System.out.println(num + ": Odd");
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }));
        // Second Thread
        CompletableFuture<Void> evenFuture = CompletableFuture.runAsync(() -> IntStream.rangeClosed(1, maxNum)
                .filter(num -> num % 2 == 0)
                .forEach(num -> {

                    try {

                        System.out.println(num + ": Even");
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }));
        CompletableFuture<Void> allOf = CompletableFuture.allOf(oddFuture, evenFuture);
        allOf.join();
    }

    private static void printOddAndEvenNumber1(int maxNum) {
        ExecutorService odd = getThead("Odd");
        ExecutorService even = getThead("Even");

        //One thread
        CompletableFuture<Void> oddFuture = CompletableFuture.runAsync(() -> IntStream.rangeClosed(1, maxNum)
                .filter(num -> num % 2 != 0)
                .forEach(num -> {
                    System.out.println(num + ": Odd");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }), odd);
        // Second Thread
        CompletableFuture<Void> evenFuture = CompletableFuture.runAsync(() -> IntStream.rangeClosed(1, maxNum)
                .filter(num -> num % 2 == 0)
                .forEach(num -> {
                    System.out.println(num + ": Even");
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }), even);
        CompletableFuture<Void> allOf = CompletableFuture.allOf(oddFuture, evenFuture);
        allOf.join();
        even.shutdown();
        odd.shutdown();
    }


    private static ExecutorService getThead(String name) { //Optional
        return Executors.newSingleThreadExecutor(thread -> {
            Thread t = new Thread(thread);
            t.setName(name);
            return t;
        });
    }
}
