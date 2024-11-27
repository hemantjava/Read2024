package org.dsa.interview.congnizant;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class SummarizingInt {
    public static void main(String[] args) {
        String str = "1235";
        Integer sum = Arrays.stream(str.split("")).map(Integer::parseInt).reduce(Integer::sum).orElse(0);
        Integer anElse = str.chars().mapToObj(c -> c - '0').reduce(0, Integer::sum);
        IntSummaryStatistics collect = str.chars().mapToObj(c -> c - '0').collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sum);
        System.out.println(anElse);
        System.out.println(collect);
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
    }
}