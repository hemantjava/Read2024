package org.dsa.dsa.searching;

// Time complexity O(log n)
public class BinarySearch {

    public static void main(String[] args) {
  int[] array = new int[]{1,3,5,7,9};
        final var searchIndex = binarySearch(array, 7);
        System.out.println(searchIndex);
        System.out.println(array[searchIndex]);
        System.out.println(binarySearch(array,4));
    }

    //Return index of search element if not present return -1.
    //Array should be sorted form
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;  //here mid is index  // left + (right - left)/2  for integer range exceeded case
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
