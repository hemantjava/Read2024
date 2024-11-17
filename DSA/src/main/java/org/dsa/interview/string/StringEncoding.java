package org.dsa.interview.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringEncoding {
    public static void main(String[] args) {
        String str = "aabbcccdei";
        System.out.println(convertStream(str));// 2a2b3c1d1e1i
        System.out.println(convert(str));// 2a2b3c1d1e1i
    }

    private static String convert(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(v).append(k));
        return sb.toString();
    }

    private static String convertStream(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getValue() + "" + entry.getKey()).collect(Collectors.joining());
    }


}
