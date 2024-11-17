package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDelayedExecutor {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Delayed Task",
                CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS));

        future.thenAccept(System.out::println); // Output after 2 seconds: Delayed Task

    }
}
