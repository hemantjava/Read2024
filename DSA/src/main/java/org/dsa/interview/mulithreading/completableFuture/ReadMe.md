## CompletableFuture 
CompletableFuture is a powerful feature in Java for asynchronous programming, allowing you to write non-blocking code 
and handle asynchronous operations efficiently.
and it includes various methods for chaining, combining, handling exceptions

## Basic Async Methods
  * runAsync: Runs a **Runnable** task asynchronously without returning a result.
  * supplyAsync: Runs a **Supplier** task asynchronously and returns a result.
```java
CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
    System.out.println("Running a task in the background.");
});

CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
    return "Hello, World!";
});
```
## Chaining with thenApply, thenAccept, and thenRun
 * thenApply: Transforms the result of a CompletableFuture.
 * thenAccept: Consumes the result without returning anything.
 * thenRun: Runs a Runnable after a CompletableFuture completes but does not take the result as input.
```java
CompletableFuture<String> future3 = future2.thenApply(result -> result + " - Transformed");
future3.thenAccept(result -> System.out.println("Result after transformation: " + result));

future3.thenRun(() -> System.out.println("This runs after future3 completes"));
```
## Combining Multiple Futures
 * thenCombine: Combines two CompletableFuture results.
 * thenCompose: Chains two asynchronous tasks where the result of the first is used to start the second.

## Handling Exceptions
 * exceptionally: Handles an exception and provides a fallback value.
 * handle: Handles the result or exception together in one callback.

## Waiting for Multiple Futures
 * allOf: Completes when all given CompletableFutures are complete.
 * anyOf: Completes when any one of the given CompletableFutures completes.
## orTimeout() and completeOnTimeout()
  Sets a timeout for the CompletableFuture.
  * orTimeout() sets a timeout and throws a TimeoutException if not completed within the specified time.
  * completeOnTimeout() sets a timeout and completes with a default value if not completed within the specified time.
# Summary
These methods provide a flexible API for asynchronous programming:
* Basic Async: runAsync, supplyAsync
* Chaining: thenApply, thenAccept, thenRun
* Combining: thenCombine, thenCompose
* Exception Handling: exceptionally, handle
* Waiting for Multiple: allOf, anyOf
* Timeouts: orTimeout, completeOnTimeout