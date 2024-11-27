package org.dsa.interview.bitwise;

public class AndExample {
    /**
     * The AND operator (&) perform a bitwise AND operation on two numbers.
     * It returns 1 only if both corresponding bits are 1.
     * 1 & 1 = 1 and
     * 1 & 0 = 0
     * 0 & 0 = 0
     **/
    public static void main(String[] args) {
        int x = 5; //101
        int y = 4;//100
        int result = x & y; //100
        System.out.println("Result: " + result);
    }
}
