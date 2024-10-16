package org.dsa.interview.stream;

import java.util.Comparator;
import java.util.List;

public class SecondHighAndLowInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,8,3,6,9,8);
        System.out.println(getSecondHigh(list));
        System.out.println(getSecondLow(list));

    }

    private static int getSecondHigh(List<Integer> list){
        return list
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .orElse(0);
    }

    private static int getSecondLow(List<Integer> list){
        return list
                .stream()
                .distinct()
                .sorted()
                .skip(1)
                .limit(1).
                findFirst()
                .orElse(0);
    }
}
