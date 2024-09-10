package org.dsa.interview.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfCharToString {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('q', 'u', 'e', 'u', 'e');
        System.out.println(charToString1(list));

    }

    private static String charToString(List<Character> charList) {
        return charList.stream().collect(StringBuffer::new, StringBuffer::append, StringBuffer::append).toString();
    }

    private static String charToString1(List<Character> charList) {
        return charList.stream().map(character -> String.valueOf(character)).collect(Collectors.joining(""));
    }
}