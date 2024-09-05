package org.dsa.interview.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 3, 6, 8, 4};
        int target = 10;
        System.out.println(Arrays.toString(getTwoIndex(numbers, target)));

    }

    private static int[] getTwoIndex(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // for holding index

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; //fetching index of value
            } else {
                map.put(array[i], i); // Storing all array values
            }
        }
        return new int[]{0};
    }
}
