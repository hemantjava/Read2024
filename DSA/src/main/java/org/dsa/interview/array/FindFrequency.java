package org.dsa.interview.array;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7, 8, 9, 9, 8, 7, 6, 5, 4, 4, 3, 3, 3, 1};
        frequency(array);
    }

    private static void frequency(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
