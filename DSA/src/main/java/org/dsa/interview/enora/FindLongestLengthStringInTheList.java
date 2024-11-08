package org.dsa.interview.enora;

import java.util.Comparator;
import java.util.List;

public class FindLongestLengthStringInTheList {
    public static void main(String[] args) {
        List<String> list = List.of("hemant","sahu","sarita","dharmendra");
        String string = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(string);
    }
}
