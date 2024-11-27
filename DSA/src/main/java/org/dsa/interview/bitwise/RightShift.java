package org.dsa.interview.bitwise;

/**
 * 00000101  (5 in decimal), After 1 bit right shift
 * 00000010  (2 in decimal)
 */
public class RightShift {
    public static void main(String[] args) {
        int num = 5; //101
        int i = 1;
        int result = rightShift(num, i);//10 => 2

        System.out.println("Right shift of " + num + " by "+ i+" places: " + result);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(Integer.toBinaryString(-8));
    }

    private static int rightShift(int num, int i) {
        return num >> i;
    }
}
