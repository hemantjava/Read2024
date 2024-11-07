package org.dsa.interview.enora;

import java.util.concurrent.*;

public class AddTwoNumbers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int a = 10;
        int b = 20;
        Future<Integer> submit1;
        Future<Integer> submit2;
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            Callable<Integer> t1 = () -> a;
            Callable<Integer> t2 = () -> b;
            submit1 = executor.submit(t1);
            submit2 = executor.submit(t2);
        }
        final int result = submit2.get() + submit1.get();
        System.out.println(result);
    }
}
