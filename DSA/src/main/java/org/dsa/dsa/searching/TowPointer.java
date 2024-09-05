package org.dsa.dsa.searching;

public class TowPointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println("index: " +searchElementIndex(arr, target));
        System.out.println("value: " +searchElementValue(arr, target));
    }

    private static int searchElementIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] == target) {
                return left;
            }
            else if (arr[right] == target) {
                return right;
            }
            left++;
            right--;
        }
        return -1; //If not found
    }

    private static int searchElementValue(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] == target) {
                return target;
            }
            else if (arr[right] == target) {
                return target;
            }
            left++;
            right--;
        }
        return -1; //If not found
    }
}
