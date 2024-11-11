package org.dsa.interview.enora;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateSubstring {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("sunday", "monday", "tuesday",
                "wednesday", "thursday", "friday", "sun", "mon"));

        // Remove duplicates based on substring matches
        List<String> filteredList = list.stream()
                .filter(word -> list.stream()
                        .noneMatch(other -> other.contains(word) && !other.equals(word)))
                .toList();
        System.out.println(filteredList);//[sunday, monday, tuesday, wednesday, thursday, friday]
    }

}
