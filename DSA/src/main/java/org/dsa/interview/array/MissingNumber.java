package org.dsa.interview.array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 6};
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(missingNumber(numbers));
        System.out.println(missingNumber(numbers2));
    }
  // sum of natural nums = size *(size)/2
    private static int missingNumber(int[] numbers) {
        final var sum = Arrays.stream(numbers).sum();
        final var size = numbers.length + 1; // actual number
        return size * (size + 1) / 2 - sum;
    }
}
