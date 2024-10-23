package org.dsa.interview.array;

import java.util.Arrays;

public class FindTwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9};
        int target = 12;
        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }

    private static int[] findTwoSum(int[] arr, int target) {
        int[] result = new int[2];
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result[0] = left;
                result[1] = right;
                return result;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }


}
