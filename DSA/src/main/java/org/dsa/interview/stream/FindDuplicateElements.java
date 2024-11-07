package org.dsa.interview.stream;

import java.util.*;
import java.util.function.Predicate;

public class FindDuplicateElements {
    public static void main(String[] args) {
        //Lists
        List<Integer> list = List.of(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 3, 5, 8, 9, 12);
        findDuplicateElements(list);
        findDuplicateElements1(list);

        //Arrays
        int[] elements = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 3, 5, 8, 9, 12};
        findDuplicateElements(elements);
        findDuplicateElements1(elements);
    }

    private static void findDuplicateElements1(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        list.stream().filter(Predicate.not(set::add)).forEach(System.out::println);
    }

    private static void findDuplicateElements(List<Integer> list) {
        list.stream().filter(d -> Collections.frequency(list, d) > 1)
                 .distinct()
                .forEach(System.out::println);
    }

    private static void findDuplicateElements1(int[] elements) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(elements).filter(e -> !set.add(e)).forEach(System.out::println);
    }

    private static void findDuplicateElements(int[] elements) {
        Arrays.stream(elements).filter(d -> Collections.frequency(List.of(elements), d) > 1)
                .distinct()
                .forEach(System.out::println);
    }
}
