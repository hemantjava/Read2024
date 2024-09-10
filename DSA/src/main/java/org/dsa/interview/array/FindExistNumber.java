package org.dsa.interview.array;

import java.util.Arrays;

public class FindExistNumber {
    public static void main(String[] args) {
        int[] numbers = {1,4,7,9};
        System.out.println(isPresent1(numbers,5));
        System.out.println(isPresent1(numbers,9));
    }
    private static boolean isPresent(int[] array,int num){
        final var search = Arrays.binarySearch(array, num);
        return search == num;
        //return Arrays.stream(array).anyMatch(value -> value == num);
    }

    private static boolean isPresent1(int[] array,int num){

        int l = 0;
        int r = array.length-1;
        while (l<r){
            if (num == array[l])
                return true;
            else if (num == array[r])
                return true;
            l++;
            r--;
        }
        return false;
    }

}
