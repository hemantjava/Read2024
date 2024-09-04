package org.dsa.interview.array;

public class TwoDArray {
    public static void main(String[] args) {
        final int[][] twoD = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int[] oneD:twoD) {
            for (int a: oneD) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
