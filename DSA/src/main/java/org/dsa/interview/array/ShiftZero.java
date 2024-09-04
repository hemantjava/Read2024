package org.dsa.interview.array;

import java.util.Arrays;

public class ShiftZero {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 0, 0, 6, 7, 0, 0};
        System.out.println("Before: " + Arrays.toString(array));
        shiftZeroToEnd(array);
        System.out.println("After end shift: " + Arrays.toString(array));
        shiftZeroToStart(array);
        System.out.println("After start shift: " + Arrays.toString(array));

    }

    private static void shiftZeroToEnd(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }
        while (index < array.length) {
            array[index++] = 0;
        }
    }

    private static void shiftZeroToStart(int[] array) {
        int index = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[index--] = array[i];
            }
        }
        while (index >= 0) {
            array[index--] = 0;
        }
    }
}
