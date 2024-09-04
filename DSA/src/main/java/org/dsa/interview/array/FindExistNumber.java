package org.dsa.interview.array;

import java.util.Arrays;

public class FindExistNumber {
    public static void main(String[] args) {
        int[] numbers = {1,4,7,9};
        System.out.println(isPresent(numbers,5));
        System.out.println(isPresent(numbers,9));
    }
    private static boolean isPresent(int[] array,int num){
        final var search = Arrays.binarySearch(array, num);
        return search == num;
        //return Arrays.stream(array).anyMatch(value -> value == num);
    }
}
