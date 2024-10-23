package org.dsa.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length; // length of array

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element index in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
