package org.dsa.interview.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueLongestSubstring {

    public static void main(String[] args) {
        String input = "aaaaabbcdee";
        findUniqueLongestSubstring(input);//bcde
        String string = "java";
        findUniqueLongestSubstring(string);//jav
        System.out.println("--------------------------------");
        System.out.println("input: " + longestSubstringLength(input));
        System.out.println("string: " + longestSubstringLength(string));
    }

    private static void findUniqueLongestSubstring(String input) {
        String longestSubString = "";
        int lengthOfLongestSubstring = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
            } else {
                i = map.get(chars[i]); //start from exist character
                map.clear();
            }

            if (map.size() > lengthOfLongestSubstring) {
                lengthOfLongestSubstring = map.size();
                longestSubString = map.keySet().stream().map(String::valueOf).collect(Collectors.joining());
            }
        }

        System.out.println("longestSubstring: " + longestSubString);
        System.out.println("lengthOfLongestSubstring: " + lengthOfLongestSubstring);
    }

    public static int longestSubstringLength(String string) {
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char visited = string.charAt(i);
            if (!map.containsKey(visited)) {
                map.put(visited, i);
            } else {
                i = map.get(visited);
                map.clear();
            }
            maxLength = Math.max(maxLength, map.size());
        }
        return maxLength;
    }

    //best way sliding window
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            int index = s.indexOf(currentChar, left);
            if (index < right) {
                left = index + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

}
