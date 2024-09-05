package org.dsa.interview.string;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxOccursCharInString {
    public static void main(String[] args) {
        System.out.println(maxChar("hemantsahuh"));
    }

    private static Character maxChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey).orElseThrow(()-> new RuntimeException("Empty String"));

    }
}
