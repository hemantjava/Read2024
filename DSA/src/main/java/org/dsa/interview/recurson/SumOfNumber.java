package org.dsa.interview.recurson;

public class SumOfNumber {


    public static void main(String[] args) {
        int num = 5;
        System.out.println(recursiveSum(num));
    }

    private static int recursiveSum(int num) {
        if (num<= 0)
            return 0;
        return num + recursiveSum(num -1);
    }

    public static void printDecreasingOrder(int num) {
        if (num <= 0)
            return;
        System.out.print(num+" ");
        printDecreasingOrder(num - 1);
    }
    public static void printIncreasingOrder(int num) {
        if (num <= 0)
            return;
        printIncreasingOrder(num - 1);
        System.out.print(num+" ");
    }
}
