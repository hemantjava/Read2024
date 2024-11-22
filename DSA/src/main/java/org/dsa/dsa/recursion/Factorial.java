package org.dsa.dsa.recursion;

//method calls itself until it doesn't
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    /*

execution    Call stacks

4    1                  ->4th call
3    2 * factorial(1)   ->3rd call
2    3 * factorial(2)   ->2nd call
1    4 * factorial(3)   ->1st call

Execution:- top to bottom
    => 1
    => 2 * 1 =2
    => 3 * 2 =6
    => 4 * 6 =24  result

        */
    }

    private static int factorial(int num) {
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }
}
