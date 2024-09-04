package org.dsa.interview.array;

import java.util.Arrays;

import static java.util.stream.Collectors.toSet;

/*
[1,2,3]
[3,2,1]
[2,3,1,1,1,2,2,3]
[1,2,3,4]
 */
public class CompareTwoArrayHasSameElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 1, 1, 1, 2, 2, 3};
        System.out.println(check(a, b));
    }

    private static boolean check(int[] a, int[] b) {
        final var collect = Arrays.stream(a).boxed().collect(toSet());
        final var collect1 = Arrays.stream(b).boxed().collect(toSet());
        return collect.stream().allMatch(r -> collect1.contains(r) && collect1.size() == collect.size());
    }
}