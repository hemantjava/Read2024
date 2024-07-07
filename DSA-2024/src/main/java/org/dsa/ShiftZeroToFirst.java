package org.dsa;

import java.util.Arrays;

public class ShiftZeroToFirst {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 8, 9, 0, 0, 1, 2};
        shiftZeroToFirst(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftZeroToFirst(int[] arr) {
        int writeIndex = arr.length-1;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] != 0){
                if (arr[writeIndex] == 0){
                    int temp = arr[i];
                    arr[i] = arr[writeIndex];
                    arr[writeIndex] = temp;
                }
                writeIndex--;
            }
        }
    }
}
