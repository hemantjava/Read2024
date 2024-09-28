package org.dsa.interview.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonReapetingCharacter {
    public static void main(String[] args) {
        String str = "hatsahut";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        Character character = map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst().orElse(null);
        System.out.println(character);
    }
}
