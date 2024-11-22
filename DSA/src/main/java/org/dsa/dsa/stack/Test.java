package org.dsa.dsa.stack;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(2);
        set.parallelStream().forEach(System.out::println);
        set.stream().parallel().forEach(System.out::println);
        System.out.println(set);//[1,5,3,2]
    }
}
