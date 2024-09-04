package org.dsa.interview.array;

import java.util.Arrays;

public class ShiftZeroInArray {
    /**
     * You are given an array of 0s and 1s in random order. Segregate 0s on the left side and 1s on
     * the right side of the array. The basic goal is to traverse array elements and sort in segregating 0s and 1s.
     * <p>
     * Illustration:
     * <p>
     * Input array     =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
     * Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int[] narr = new int[array.length];

        int left = 0;
        int right = array.length - 1;
        for (int num : array) {
            if (num == 0) {
                narr[left++] = 0;
            } else {
                narr[right--] = 1;
            }
        }
        System.out.println(Arrays.toString(narr));
    }

}