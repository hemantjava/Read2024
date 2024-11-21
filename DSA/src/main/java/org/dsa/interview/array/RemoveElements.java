package org.dsa.interview.array;

import java.util.Arrays;

/**
 * Example 2:
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 */
public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElements(nums, val));//5
        System.out.println(Arrays.toString(nums));//[0, 1, 3, 0, 4, 0, 4, 2]

        int[] nums2 = {1, 1, 2};
        System.out.println(removeDuplicates(nums2));//2
        System.out.println(Arrays.toString(nums2));//[1, 2, 2]
    }

    private static int removeElements(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Pointer for the position of unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { // Check if the current number is different
                nums[k] = nums[i];// Move the unique element to the position k
                k++;
            }
        }
        return k;
    }
}
