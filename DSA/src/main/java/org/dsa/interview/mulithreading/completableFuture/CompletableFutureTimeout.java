package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTimeout {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000); // Simulate long-running task
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    return "Result";
                }).orTimeout(2, TimeUnit.SECONDS)
                .exceptionally(ex -> "Timed out!");
        future.thenAccept(System.out::println);

        CompletableFuture<String> futureWithDefault = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000); // Simulate long-running task
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            return "Result";
        }).completeOnTimeout("Default Result", 2, TimeUnit.SECONDS);

        futureWithDefault.thenAccept(System.out::println); // Output: Default Result

    }
}
