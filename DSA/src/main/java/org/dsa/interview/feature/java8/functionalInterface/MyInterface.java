package org.dsa.interview.feature.java8.functionalInterface;


public interface MyInterface {
    default void newMethod() {
        System.out.println("New default method");
    }

    static void newMethodStatic() {
        System.out.println("New static method");
    }
}
