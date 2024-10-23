package org.dsa.interview.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringCapitalization {
    public static void main(String[] args) {
        List<String> words = List.of("hemant","naveen","ritesh");
        List<String> capitalize = capitalize(words);
        System.out.println(capitalize);
    }

    private static List<String> capitalize(List<String> words) {
        return words.stream().map(s -> s.substring(0,1).toUpperCase() + s.substring(1)).collect(Collectors.toList());
    }
}
