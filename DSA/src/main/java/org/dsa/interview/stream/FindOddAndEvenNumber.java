package org.dsa.interview.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOddAndEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Map<String, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0 ? "EVEN" : "ODD"));
        collect.forEach((k,v)->{
            System.out.println(k + ": " + v);
        });
    }
}
