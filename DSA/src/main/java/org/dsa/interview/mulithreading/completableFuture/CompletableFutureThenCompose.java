package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenCompose {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result + " World"));

        future.thenAccept(System.out::println); // Output: Hello World

    }
}
