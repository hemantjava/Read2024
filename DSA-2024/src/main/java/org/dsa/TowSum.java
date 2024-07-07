package org.dsa;

import java.util.*;

public class TowSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int target = 4;
        System.out.println(Arrays.toString(isAvailable(arr, target)));
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(getIndexes(arr, target)));
        System.out.println(Arrays.toString(twoSumIndex(arr, target)));

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

    //Return two sum indexes

    private static int[] getIndexes(int[] arr, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp))
                return new int[]{map.get(temp), i};
            map.put(arr[i], i);//(value,index)
        }
        return new int[]{-1, -1};
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
