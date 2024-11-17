package org.dsa.interview.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurance {

    //Given an array of integers arr, return true if the number of occurrences of each value
    // in the array is unique or false otherwise.
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));//true
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapf = new HashMap<>();
        for (int x : arr) {
            mapf.put(x, mapf.getOrDefault(x, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(mapf.values());

        return mapf.size() == set.size();
    }
}
