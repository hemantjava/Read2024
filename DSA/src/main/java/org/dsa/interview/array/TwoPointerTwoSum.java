package org.dsa.interview.array;

import java.util.Arrays;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class TwoPointerTwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSumIndex(arr, target)));
        int[] nums = {1, 2, 3, 4, 6};
        int trg = 6;
        System.out.println(Arrays.toString(twoPointers(nums,trg)));//[1,3]
    }

    //it is applicable if an array has sorted order only
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

    //it is applicable if an array has sorted order only
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

    private static int[] twoPointers(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
             if (nums[left] + nums[right] == target)
                 return new int[]{left, right};
             if (nums[left] + nums[right] < target){
                 left++;
             }else {
                 right--;
             }
        }
        return new int[]{-1, -1};
    }


}
