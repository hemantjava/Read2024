package org.dsa.interview.array;

public class MinDistance {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 1;
        int start = 9;
        System.out.println(getMinDistance(nums, target, start));
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int ans = 100000;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = Math.min(Math.abs(i - start), ans);
            }
        }
        return ans;
    }
}
