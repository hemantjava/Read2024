package org.dsa.interview.array;


import java.util.LinkedHashMap;
import java.util.Map;

// those elements frequencies > n/3
public class MajorityElements {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] array1 = {1, 2};
        majorityElements(array);
        System.out.println("======================");
        majorityElements(array1);
    }

    private static void majorityElements(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        map.entrySet().stream().filter(entry -> entry.getValue() > array.length / 3)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
