package org.dsa.interview.array;

public class ArrayRotation {
    public static String arrayRotation(int[] arr) {
        // The first element determines the rotation index
        int n = arr[0]; // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        // Append elements from the rotation index to the end of the array
        for (int i = n; i < arr.length; i++) {
            result.append(arr[i]);
        } // Append elements from the start of the array up to the rotation index
        for (int i = 0; i < n; i++) {
            result.append(arr[i]);
        }
        // Return the result as a string
        return result.toString();
    }

    public static void main(String[] args) {
        // Example test cases
        int[] arr1 = {2, 3, 4, 1, 6, 10}; //->2 is 1st element
        int[] arr2 = {3, 2, 1, 6};//->3 is 1st element
        int[] arr3 = {4, 3, 4, 3, 1, 2};//->3 is 1st element
        System.out.println(arrayRotation(arr1));// Output: 4161023
        System.out.println(arrayRotation(arr2)); // Output: 6321
        System.out.println(arrayRotation(arr3)); // Output: 124343
    }
}
