package org.dsa.interview.array;

import java.util.Arrays;
import java.util.HashSet;

public class CheckDuplicateContains {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(checkDuplicate(nums));
        System.out.println(checkDuplicate2(nums));
        System.out.println(checkDuplicate3(nums));
    }

    //TC: O(n log n)
    private static boolean checkDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    //TC: O(n) SC:(n)
    private static boolean checkDuplicate2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

    //TC: O(n^2)
    private static boolean checkDuplicate3(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
