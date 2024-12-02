package org.dsa.interview.feature.java8.functionalInterface;

/**
 * Functional interface allowing one abstract method apart from default, static,
 * defined And Object class methods allows as well but abstract form not defined type.
 */
@FunctionalInterface
public interface MyInterface {
    default void newMethod() {
        System.out.println("New default method");
    }
    int sum(int num1, int num2);
    static void newMethodStatic() {
        System.out.println("New static method");
    }
   boolean equals(Object obj);
}
