package org.dsa.interview.feature.java8.parallel;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
    }
}
