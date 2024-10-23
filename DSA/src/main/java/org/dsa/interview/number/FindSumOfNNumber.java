package org.dsa.interview.number;

import java.util.stream.IntStream;

public class FindSumOfNNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = getSumOfNNumber(n);
        System.out.println(sum);
        System.out.println(getSumOfNNumber2(n));
        char c = '1'-'0'; // '1' == 49, '0' == 48
        System.out.println(c);
    }

    private static int getSumOfNNumber(int n) {
        return  n * (n+1)/2;
    }
    private static int getSumOfNNumber2(int n) {
       return IntStream.rangeClosed(1,n)
                .reduce(0,(a,b) -> a + b);
    }
}
