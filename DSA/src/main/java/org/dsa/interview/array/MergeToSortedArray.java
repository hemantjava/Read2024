package org.dsa.interview.array;

import java.util.Arrays;

/**
 * Time Complexity:
 * The time complexity of the provided merge function is O(n+m), where n is the length of arr1 and m is the length of arr2
 * Space Complexity:
 * The space complexity of the function is O(n+m). This is because the function creates a new array arr3 to store the merged elements.
 */
public class MergeToSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 9, 15};
        int[] arr2 = {2, 5, 8, 10};
        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int index1 = 0, index2 = 0, index3 = 0;
        // Merge elements from both arrays while there are elements in both
        while (index1 < arr1.length && index2 < arr2.length) {
            arr3[index3++] = (arr1[index1] < arr2[index2]) ? arr1[index1++] : arr2[index2++];
        }
        while (index1 < arr1.length) {
            arr3[index3] = arr1[index1];
            index1++;
        }
        while (index2 < arr2.length) {
            arr3[index3] = arr2[index2];
            index2++;
        }
        return arr3;
    }
}
