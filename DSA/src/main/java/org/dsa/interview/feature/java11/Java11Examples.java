package org.dsa.interview.feature.java11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java11Examples {
    public static void main(String[] args) {
        System.out.println("========New Collection Factories in Collectors=====");
        var list = Stream.of("a", "b", "c")
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
    }
}
