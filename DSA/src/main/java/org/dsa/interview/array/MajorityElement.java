package org.dsa.interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement1(nums));
        System.out.println(majorityElement2(nums));
    }

    //O(nlogn)
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums); //[2,2,2,2,1,1,1]
        int n = nums.length; // 7
        return nums[n/2];//index = 3 , rs = 3
    }

    public static int majorityElement1(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }

    //The time complexity of the Moore's Voting Algorithm is O(n) since it traverses the array once.
    public static int majorityElement2(int[] nums) {
        int count = 0; // more count candidate has majority
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
