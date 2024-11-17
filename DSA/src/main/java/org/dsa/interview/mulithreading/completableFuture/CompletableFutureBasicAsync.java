package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * runAsync() executes a task asynchronously that doesn’t return a result.
 * supplyAsync() executes a task asynchronously that returns a result.
 */
public class CompletableFutureBasicAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Running async task without return value.");
        });
       // future1.join();
        future1.get();

         CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return "Result from async task";
        }).thenAcceptAsync(s -> {System.out.println(s);
            System.out.println(Thread.currentThread().getName());});
    }
}
