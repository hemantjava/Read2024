package org.dsa.interview.string;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutations("", str, permutations);
        return permutations;
    }

    private static void generatePermutations(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }

    public static List<String> getPermutations1(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add(""); // Start with an empty permutation

        for (char c : str.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();

            for (String permutation : permutations) {
                for (int i = 0; i <= permutation.length(); i++) {
                    String newPermutation = permutation.substring(0, i) + c + permutation.substring(i);
                    newPermutations.add(newPermutation);
                }
            }

            permutations = newPermutations;
        }

        return permutations;
    }

    public static void main(String[] args) {
        String input = "ABC";
        List<String> permutations = getPermutations(input);
        List<String> permutations1 = getPermutations1(input);
        System.out.println("Permutations of " + input + ":"+permutations);
        System.out.println("Permutations1 of " + input + ":"+permutations1);
    }
}
