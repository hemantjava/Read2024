package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

/**
 *  Combines two CompletableFuture results
 */
public class CompletableFutureThenCombine {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");
        future1.thenCombineAsync(future2, (a, b) -> a +" "+ b).thenAccept(System.out::println);
    }
}
