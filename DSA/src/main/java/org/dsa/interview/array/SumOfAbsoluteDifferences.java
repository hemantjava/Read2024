package org.dsa.interview.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Input: nums = [2,3,5]
 * Output: [4,3,5]
 * Explanation: Assuming the arrays are 0-indexed, then
 * result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
 * result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
 * result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.
 */
public class SumOfAbsoluteDifferences {
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums)));//[4,3,5]
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
      int[] result = new int[nums.length];
      int sum = 0;
      for (int i = 0; i < nums.length; i++) {
          for (int num : nums) {
              sum += Math.abs(nums[i] - num);
          }
          result[i] = sum;
          sum = 0;
      }
      return result;
    }
}
