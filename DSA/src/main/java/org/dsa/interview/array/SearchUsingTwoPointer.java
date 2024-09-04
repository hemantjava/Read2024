package org.dsa.interview.array;

import java.util.Arrays;

public class SearchUsingTwoPointer {
    public static void main(String[] args) {
     int[] array = {1,2,3,7,9};
        System.out.println(Arrays.toString(findValues(array,3)));
    }

    public static int[] findValues(int[] values, int target) {

        int start = 0; //starting pointer
        int end = values.length - 1; //ending pointer
        while (start < end) {
            if (values[start] == target) {
                return new int[]{start, target};
            } else if (values[end] == target) {
                return new int[]{start, target};
            }
            start++;
            end--;
        }

        return new int[]{-1};
    }
}
