package org.dsa.interview.leetcode;

import java.util.*;

public class LonelyNumber {

    public static void main(String[] args) {
        int[] numbers = {10, 7, 6, 3}; //adjacent +1 number not present. time complexity and space complexity both are O(n)
        System.out.println(getLonelyNumbers(numbers));
    }

    private static List<Integer> getLonelyNumbers(int[] numbers) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : numbers) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 && !map.containsKey(entry.getKey() + 1) && !map.containsKey(entry.getKey() - 1)) {
                result.add(entry.getKey());
            }
        }


        return result;
    }
}
