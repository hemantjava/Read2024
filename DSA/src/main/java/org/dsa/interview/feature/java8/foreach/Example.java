package org.dsa.interview.feature.java8.foreach;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        names.forEach(System.out::println);
    }
}
