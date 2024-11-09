package org.dsa.interview.feature.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java11Examples {
    public static void main(String[] args) throws IOException {
        System.out.println("1. Local-Variable Syntax for Lambda Parameters");

        List<String> list = List.of("apple", "banana", "cherry");
        list.forEach((var item) -> System.out.println(item));

        System.out.println("2. String API new methods");

        String text = " Hello ";
        System.out.println(text.isBlank());      // false
        System.out.println(text.strip());        // "Hello"
        System.out.println("Hello\nWorld".lines().count()); // 2
        System.out.println("Java".repeat(3));    // "JavaJavaJava"
        System.out.println(text.stripLeading());// "Hello "
        System.out.println(text.stripTrailing());// " Hello"
        System.out.println(text.stripIndent());

        System.out.println("3 The Files API Enhancements");

        Path filePath = Files.writeString(Files.createTempFile("demo", ".txt"), "Java 11");
        String content = Files.readString(filePath);
        System.out.println(content); // "Java 11"

        System.out.println("4. Optional.isEmpty() Method");

        Optional<String> optional = Optional.empty();
        System.out.println(optional.isEmpty()); // true

        System.out.println("5. New Pattern Matching with Predicate.not()");

        List<String> filteredList = Stream.of("apple", " ", "banana", "", "cherry")
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(filteredList); // ["apple", "banana", "cherry"]

        System.out.println("6. Collection.toArray Method");

        String[] array = List.of("a", "b", "c").toArray(String[]::new);
        System.out.println(Arrays.toString(array)); // [a, b, c]

        System.out.println("7. Unicode 10 Support");

        System.out.println("\u20BF"); // Bitcoin sign (₿)
        System.out.println("\uD83D\uDE0A"); // Smiling face emoji (😊)

        System.out.println("8. New Collection Factories in Collectors");

        Stream.of("a", "b", "c")
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
    }
}
