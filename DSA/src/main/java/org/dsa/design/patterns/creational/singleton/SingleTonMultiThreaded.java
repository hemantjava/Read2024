package org.dsa.design.patterns.creational.singleton;

public class SingleTonMultiThreaded {

    private static volatile SingleTonMultiThreaded single;

    private SingleTonMultiThreaded() {

    }

    public static SingleTonMultiThreaded getInstance() {
        if (single == null) {
            //2 thread comes here at a time
            synchronized (SingleTonMultiThreaded.class) { // this ensures single threading
                if (single == null) {
                    single = new SingleTonMultiThreaded();
                }
            }
        }
        return single;
    }
}
/**
 * In this example, the instance variable is marked as volatile to ensure visibility across threads.
 * The getInstance() method checks if an instance has already been created, and if not,
 * acquires a lock using the synchronized keyword, before checking again and creating a new instance if necessary.
 * The second check inside the synchronized block ensures that only one thread can enter this block and create the
 * instance if it hasn't been initialized already, This ensures thread safety.
 * If multiple threads enter the first if block at the same time, only one will be able to acquire the lock and create the instance.
 */
