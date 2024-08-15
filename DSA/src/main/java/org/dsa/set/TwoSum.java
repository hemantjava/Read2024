package org.dsa.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int target = 4;
        System.out.println(Arrays.toString(isAvailable(arr, target)));
    }

    //Two sum is exist or not if yes return those values otherwise return [-1,-1]
    private static int[] isAvailable(int[] arr, int target) {
        final Set<Integer> set = new HashSet<>();
        for (int val : arr) {
            int tem = target - val;
            if (set.contains(tem))
                return new int[]{tem, val};
            set.add(val);
        }
        return new int[]{-1, -1};
    }
}
