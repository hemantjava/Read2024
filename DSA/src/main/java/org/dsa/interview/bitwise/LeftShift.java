package org.dsa.interview.bitwise;

public class LeftShift {
    public static void main(String[] args) {
        int num = 5; //101
        int i = 1;
        int result = leftShift(num, i);//1010 => 10
        System.out.println("Left shift of " + num + " by "+ i+" places: " + result);
        System.out.println(Integer.toBinaryString(result));
    }

    private static int leftShift(int num, int i) {
        return num << i;
    }
}
