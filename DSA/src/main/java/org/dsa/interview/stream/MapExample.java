package org.dsa.interview.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        String value = "hdshjbfhjvahjvhjdsavh";
        stringOccurrences(value);

        Map<String, String> map = Map.of("hemant","sahu","sonu","sahu");
        mapResult(map);

    }

    private static void stringOccurrences(String value) {
        LinkedHashMap<Character, Integer> collect = value.chars().boxed()
                .collect(Collectors.toMap(k -> (char) k.intValue(), v -> 1, Integer::sum, LinkedHashMap::new));
        System.out.println(collect);
    }
    private static void mapResult( Map<String, String> map){
        Map<String, Integer> collect = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, v -> v.getValue().length()));
        System.out.println(collect);
    }
}
