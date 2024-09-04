package org.dsa.interview.array;

import java.util.Arrays;

public class NonRepeatedNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,2,1,3,4};//5,6,7
        Arrays.stream(numbers)
                .filter(a -> Arrays.stream(numbers).filter(n-> n == a).count() == 1).forEach(System.out::println);
    }

}
