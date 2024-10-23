package org.dsa.dsa.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,0,22,33,2};
        int target = 2;
        System.out.println(linearSearch(arr,target));
    }

    //O(n)
    private static int linearSearch(int[] arr, int target) {
        for (int val: arr){
            if (val == target)
                return val;
        }
        return -1;
    }
}
