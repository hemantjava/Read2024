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
        System.out.println("==================================");
        exceptionalFuture.handle((result, ex) -> ex != null ? "Error handled: " + ex.getMessage() : "Result: " + result)
                .thenAccept(System.out::println);

    }
}