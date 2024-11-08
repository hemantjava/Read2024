package org.dsa.interview.enora;

import java.util.concurrent.*;

public class AddTwoNumbers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int a = 10;
        int b = 20;
        System.out.println(Thread.currentThread().getName());
        final int result = getResult(a, b);
        System.out.println(result);
    }

    private static int getResult(int a, int b) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> t1 = () -> {
            System.out.println(Thread.currentThread().getName());
            return a;
        };
        Callable<Integer> t2 = () -> {
            System.out.println(Thread.currentThread().getName());
            return b;
        };
        return executor.submit(t1).get() + executor.submit(t2).get();

    }
}
