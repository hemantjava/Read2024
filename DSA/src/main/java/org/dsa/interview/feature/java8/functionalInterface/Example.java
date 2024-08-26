package org.dsa.interview.feature.java8.functionalInterface;

public class Example implements MyInterface{
    public static void main(String[] args) {
       MyInterface.newMethodStatic();
       Example example = new Example();
       example.newMethod();
    }
}
