package org.dsa.interview.array;

import java.util.Arrays;

/**
 * Time and Space Complexity:
 * Time Complexity: O(n1 + n2) where n1 and n2 are the lengths of the two arrays.
 * This is because every element from both arrays is processed exactly once.
 * Space Complexity: O(n1 + n2) for the merged array.
 */
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10};
        int[] b = {6, 7, 8, 9};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        // If there are remaining elements in arr1, add them to mergedArray
        while (i < a.length) {
            c[k++] = a[i++];
        }
        // If there are remaining elements in arr2, add them to mergedArray
        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }
}
