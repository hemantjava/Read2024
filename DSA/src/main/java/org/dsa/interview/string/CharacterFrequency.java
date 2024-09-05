package org.dsa.interview.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "kjsdkjhdfjlkjdf";
        new HashMap<>();
        frequency(str);
        frequency1(str);
    }

    private static void frequency(String input) {
        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    private static void frequency1(String input) {
        LinkedHashMap<Character, Integer> collect = input.chars().boxed()
                .collect(Collectors.toMap(k -> (char) k.intValue(), v -> 1, Integer::sum, LinkedHashMap::new));
        System.out.println(collect);
    }
}
