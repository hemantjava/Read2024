package org.dsa.interview.other;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,33,4,5,6,178,143,0,123);

        List<Integer> rs = ints.stream().filter( i -> String.valueOf(i).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(rs);
    }
}
