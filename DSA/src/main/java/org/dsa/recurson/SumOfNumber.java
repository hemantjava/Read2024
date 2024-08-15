package org.dsa.recurson;

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
}
