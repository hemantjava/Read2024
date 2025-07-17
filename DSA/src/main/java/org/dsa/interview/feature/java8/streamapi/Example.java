package org.dsa.interview.feature.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);
        List<String> countries = List.of("Australia","Canada","USA","Canada","Philippines","India","Australia");
        LinkedHashMap<String, Boolean> collect = countries.stream().collect(Collectors.toMap(
                Function.identity(), // Key: the country name
                s -> Boolean.TRUE,   // Value: always true
                (x,y)->y, // Merge function for duplicates: keep the existing value
                LinkedHashMap::new));

        collect.forEach((k,v)-> System.out.println(k+"=>"+v));
    }
}
