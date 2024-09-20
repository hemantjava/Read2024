package org.dsa.interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 7, 8, 9, 9, 8, 7, 6, 5, 4, 4, 3, 3, 3, 1};
        frequency(array);
        frequency1(array);
    }

    private static void frequency(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
    private static void frequency1(int[] array) {
        Map<Integer, Long> collect = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Map<Integer, Long> collect1 = Arrays.stream(array).boxed().collect(Collectors
                .toMap(Function.identity(), c -> 1L, Long::sum, LinkedHashMap::new));
        System.out.println(collect1);
    }
}
