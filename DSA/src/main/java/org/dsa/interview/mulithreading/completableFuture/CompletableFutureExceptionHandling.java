package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExceptionHandling {

    public static void main(String[] args) {
        CompletableFuture<String> exceptionalFuture = CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("An error occurred!");
            }
            return "Success";
        });

        exceptionalFuture
                .exceptionally(ex -> "Recovered from error: " + ex.getMessage())
                .thenAccept(System.out::println);

        exceptionalFuture.handle((result, ex) -> {
            if (ex != null) {
                return "Error handled: " + ex.getMessage();
            } else {
                return "Result: " + result;
            }
        }).thenAccept(System.out::println);

        try {
            exceptionalFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
}