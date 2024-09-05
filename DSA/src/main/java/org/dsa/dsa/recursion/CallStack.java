package org.dsa.dsa.recursion;
// step into -> method by method control goes
public class CallStack {

    private static void methodOne() {
        methodTwo();
        System.out.println("One");
    }

    private static void methodTwo() {
        methodThree();
        System.out.println("Two");
    }

    private static void methodThree() {

        System.out.println("Three");
    }

    public static void main(String[] args) {
        methodOne();
    }
}
