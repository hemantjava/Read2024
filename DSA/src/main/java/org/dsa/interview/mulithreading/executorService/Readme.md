### ExecutorService:-
an ExecutorService is a framework that provides a way to manage and execute multiple threads asynchronously.
It is part of the java.util.concurrent package and is designed to simplify the task of creating and managing threads.

The ExecutorService interface provides several methods for submitting tasks for execution, such as submit(), 
invokeAll(), and invokeAny(). It also provides methods for managing the lifecycle of the thread pool,
such as shutdown(), shutdownNow(), and awaitTermination().

there are basically 4 different implementation classes:-

1) newSingleThreadExecutor();
2) newFixedThreadPool(5);
3) newCachedThreadPool();
4) newScheduledThreadPool(6);