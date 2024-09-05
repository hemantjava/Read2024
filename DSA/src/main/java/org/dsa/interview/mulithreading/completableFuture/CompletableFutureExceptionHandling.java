package org.dsa.interview.mulithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExceptionHandling {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            // Simulating a task that may throw an exception
            if (true) { //if (true)
                throw new RuntimeException("Task failed!");
            }
            return "Task completed successfully";
        }).exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return "Fallback value"; // provide a fallback value in case of exception
        });


        try {
            String result = completableFuture.get(); // blocking call to get the result
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Exception occurred while executing the task: " + e.getMessage());
        }
    }
}