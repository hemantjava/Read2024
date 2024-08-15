package org.dsa.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6, 8, 9};
        int target = 4;

        System.out.println(Arrays.toString(getIndexes(arr, target)));
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
}
