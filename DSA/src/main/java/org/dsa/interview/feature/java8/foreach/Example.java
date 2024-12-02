package org.dsa.interview.feature.java8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        Consumer<String> consumer = System.out::print;
        Consumer<String> consumer1 = (s)-> System.out.print(s.length());
        names.forEach(consumer.andThen(consumer1));
    }
}
