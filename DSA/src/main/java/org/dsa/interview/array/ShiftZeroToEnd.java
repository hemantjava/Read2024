package org.dsa.interview.array;

import java.util.Arrays;

public class ShiftZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 8, 9, 0, 0, 1, 2}; //1st occurrence zero swapped with 1st occurrence number
        shiftZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftZeroToEnd(int[] arr) {
        int writeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[writeIndex] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[writeIndex];
                    arr[writeIndex] = temp;
                }
                writeIndex++;
            }
        }
    }
}
