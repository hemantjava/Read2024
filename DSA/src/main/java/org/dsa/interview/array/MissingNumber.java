package org.dsa.interview.array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 6};
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(missingNumber(numbers));
        System.out.println(missingNumber(numbers2));
        System.out.println(missingNumber1(numbers));
        System.out.println(missingNumber1(numbers2));
    }
  // sum of natural nums = size *(size)/2
    private static int missingNumber(int[] numbers) {
        final var sum = Arrays.stream(numbers).sum();
        final var size = numbers.length + 1; // actual size(number of elements)
        return size * (size + 1) / 2 - sum;
    }
    private static int missingNumber1(int[] numbers) {
        int missingNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
              if (i+1 != numbers[i]) {
                  missingNumber = i+1;
                  break;
              }
        }
        return missingNumber;
    }
}
