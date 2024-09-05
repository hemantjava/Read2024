package org.dsa.interview.array;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3};
        System.out.println(isSorted(array));
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
