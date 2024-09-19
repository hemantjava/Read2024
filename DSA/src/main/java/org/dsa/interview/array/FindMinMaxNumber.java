package org.dsa.interview.array;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,7,6,3};

        findMinMaxNumber(numbers);
    }

    private static void findMinMaxNumber(int[] numbers) {
        if (numbers.length<2){
            System.out.println("in valid input");
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length ; i++) {

            if (min > numbers[i])
                min = numbers[i];
            if (max < numbers[i])
                max = numbers[i];

        }
        System.out.println("min: " + min + " max: " + max);
    }
}
