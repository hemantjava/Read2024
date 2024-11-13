package org.dsa.interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram("anagram", "mnagraa"));
        System.out.println(isValidAnagram1("anagram", "mnagraa"));
        System.out.println(isValidAnagram2("anagram", "mnagraa"));
    }

    private static boolean isValidAnagram(String source, String target) {

        if (source.length() != target.length()) {
            return false;
        }
        char[] array1 = source.toCharArray();
        char[] array2 = target.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    //preferred one
    private static boolean isValidAnagram1(String source, String target) {

        //length should be equal to target length and source length
        if (source.length() != target.length()) {
            return false;
        }
        int[] temp = new int[26];

        for (int i = 0; i < source.length(); i++) {
            temp[source.charAt(i) - 'a']++; //(source.charAt(i) - 'a') -> index
            temp[target.charAt(i) - 'a']--;
        }
        for (int v : temp) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isValidAnagram2(String str1, String str2) {
        // Remove any whitespace and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a single map to track character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Increment the count for each character in the first string
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrement the count for each character in the second string
        for (char c : str2.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);//char if not exist then return 0
            if (count == 0) {
                return false; // Character not found in str1
            }
            charCountMap.put(c, count - 1);
        }

        return true; // All counts are zero, so strings are anagrams

    }
}
