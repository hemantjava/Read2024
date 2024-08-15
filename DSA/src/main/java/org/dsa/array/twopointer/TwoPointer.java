package org.dsa.array.twopointer;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSumIndex(arr, target)));
    }

    //it is applicable if array has sorted order only
    private static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (target == sum)
                return new int[]{arr[left], arr[right]};
            else if (target > sum)
                left++;
            else
                right--;
        }
        return new int[]{-1, -1};
    }

    //it is applicable if array has sorted order only
    private static int[] twoSumIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (target == sum)
                return new int[]{left, right};
            else if (target > sum)
                left++;
            else
                right--;
        }
        return new int[]{-1, -1};
    }
}
