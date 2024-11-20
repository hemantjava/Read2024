package org.dsa.interview.array;

public class RotateKTimeArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n; // Handle cases where k >= n

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a part of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7}; //->7654321 -> 5674321 ->5671234
        int k = 3;

        rotate(nums, k);
      //  nums = rotate1(nums,k);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotate1(int[] nums, int k) {
        int len = nums.length -k;
        int count =0;
        int[] arr = new int[nums.length];
        for(int i = len; i < nums.length; i++){
            arr[count++] =nums[i];
        }
        for(int i = 0; i<len; i++){
            arr[count++] = nums[i];
        }
     return arr;
    }
}
