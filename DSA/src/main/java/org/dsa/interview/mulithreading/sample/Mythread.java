package org.dsa.interview.mulithreading.sample;

public class Mythread {

    public static Runnable run() {
     return  () -> System.out.println("Mythread " + Thread.currentThread());
    }

    public static void main(String[] args) {

        Thread thread = new Thread(run());
        thread.start();
        System.out.println("Main " + Thread.currentThread());
    }
}
