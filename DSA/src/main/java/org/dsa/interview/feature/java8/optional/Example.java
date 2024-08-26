package org.dsa.interview.feature.java8.optional;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");
        name.map(String::toUpperCase).ifPresent(System.out::println);
    }
}
