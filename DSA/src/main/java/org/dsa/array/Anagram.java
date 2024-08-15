package org.dsa.array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram("anagram", "mnagraa"));
        System.out.println(isValidAnagram1("anagram", "mnagraa"));
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

    private static boolean isValidAnagram1(String source, String target) {

        if (source.length() != target.length()) {
            return false;
        }
        int[] temp = new int[26];

        for (int i = 0; i < source.length(); i++) {
            temp[source.charAt(i) - 'a']++;
            temp[target.charAt(i) - 'a']--;
        }
        for (int v : temp) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
