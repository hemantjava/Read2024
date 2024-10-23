package org.dsa.interview.stream;

import java.util.List;

public class FindNumberStartWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,5,11,119,32,16);
        findNumberStartWithOne(numbers);
    }

    private static void findNumberStartWithOne(List<Integer> numbers) {
        numbers.stream().filter(i -> Integer.toString(i).startsWith("1")).forEach(System.out::println);
    }

}
