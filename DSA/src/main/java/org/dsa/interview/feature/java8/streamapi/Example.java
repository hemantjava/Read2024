package org.dsa.interview.feature.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);
    }
}
