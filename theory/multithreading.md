### What are differences between submit() and execute() methods in ExecutorService?
-> submit() and execute().
Both methods execute tasks asynchronously using a thread pool managed by the ExecutorService. 
However, there are some differences between the two methods.

1) Return value: To submit() method returns a Future object that can be used to retrieve the result of the task 
execution or to cancel the task. and execute() method does not return anything.

2) Task type: To submit() method can accept tasks that implement either the Callable or Runnable interfaces, 
while the execute() method can only accept tasks that implement the Runnable interface.

3) Blocking behavior: To submit() method is a blocking call that waits for the task to complete and return its result
before returning. The execute() method is a non-blocking call that simply submits the task for execution and returns immediately.

### Difference between  newCachedThreadPool vs newFixedThreadPool
Both newCachedThreadPool and newFixedThreadPool are factory methods in the java.util.concurrent.Executors class 
that create thread pools. However, they differ in their behavior and use cases.

-> newCachedThreadPool() creates a thread pool that will automatically adjust its size based on the current workload.
It starts with zero threads and creates new threads as needed to handle incoming tasks.
If a thread remains idle for 60 seconds, it is terminated and removed from the pool.
This makes it ideal for scenarios where you have a large number of short-lived tasks and you want to optimize
the use of system resources.

-> newFixedThreadPool(int nThreads) creates a thread pool with a fixed number of threads.
Once all threads are in use, new tasks are queued until a thread becomes available.
This makes it ideal for scenarios where you have a fixed amount of resources to dedicate to task processing, 
such as when you are processing a large number of long-running tasks.

-> In summary, the newCachedThreadPool() is best suited for situations where you have a lot of short-lived tasks and 
want to optimize resource usage, while newFixedThreadPool(int nThreads) is better for scenarios
where you have a fixed amount of resources to process a large number of long-running tasks.

**=>CyclicBarrier vs countdownlatch difference**

*) Usage: CyclicBarrier is used to synchronize a group of threads at a specific point, where each thread waits for other
threads to reach the same point, and then all threads can proceed together. 
CountDownLatch is used to synchronize one or more threads by waiting for them to complete a set of tasks.

*) Constructor: CyclicBarrier takes two arguments: the number of threads that need to reach the barrier and a Runnable that is
    executed when all threads reach the barrier.
    CountDownLatch takes a single argument that represents the number of events that need to occur before the latch is released.

### Difference between Future and CompletableFuture?
 -> a CompletableFuture is an extension of Future that allows for more advanced composition and chaining of asynchronous computations.
 ![img.png](images/img12.png)