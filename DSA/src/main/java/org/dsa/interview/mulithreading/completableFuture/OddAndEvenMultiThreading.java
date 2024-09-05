package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class OddAndEvenMultiThreading {
    public static void main(String[] args) {
        final var odd = getThead("Odd");
        final var even = getThead("Even");
        IntStream.rangeClosed(1, 20).forEach(num -> {
            CompletableFuture<Void> thenApplyAsync = CompletableFuture
                    .runAsync(() -> {
                        if (num % 2 != 0) {
                            System.out.println(num + " " + Thread.currentThread().getName());
                        }
                    }, odd);
            CompletableFuture<Void> thenApplyAsync2 = CompletableFuture
                    .runAsync(() -> {
                        if (num % 2 == 0) {
                            System.out.println(num + " " + Thread.currentThread().getName());
                        }
                    }, even);
            CompletableFuture.allOf(thenApplyAsync, thenApplyAsync2).join();
        }); //end of forEach() method
        odd.shutdown();
        even.shutdown();
    }

    private static ExecutorService getThead(String name) {
        return Executors.newSingleThreadExecutor(thread -> {
            Thread t = new Thread(thread);
            t.setName(name);
            return t;
        });
    }
}
