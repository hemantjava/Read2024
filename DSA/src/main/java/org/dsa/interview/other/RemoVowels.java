package org.dsa.interview.other;

import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class RemoVowels {

    public static void main(String[] args) {
        System.out.println(remoVowels("hemantsahu"));
    }

    private static Object remoVowels(String input) {

        return input.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(Predicate.not(RemoVowels::isVowel))
                .map(String::valueOf)
                .collect(joining());


    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".contains(String.valueOf(c));
    }
}
