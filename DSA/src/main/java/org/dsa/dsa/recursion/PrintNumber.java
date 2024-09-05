package org.dsa.dsa.recursion;

public class PrintNumber {
    public static void main(String[] args) {
        int val = print(16);
        System.out.println(val);
        binary(6);//101
    }

    private static int print(int num) {
        if (num == 1)
            return 0;
        return 1 + print(num / 2);
    }

    private static void binary(int num) {
        if (num == 0)
            return;
        binary(num / 2);
        System.out.print(num % 2);
    }
}
