package org.dsa.dsa.searching;

//To finding middle elements
public class FastAndSlow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(fastAndSlow(arr));
    }

    //find the middle element
    private static int fastAndSlow(int[] arr) {
        int slow = 0;
        int fast = 0;
        while (fast < arr.length && slow < arr.length) {
            fast = fast + 2;
            slow = slow + 1;
        }
        return slow;
    }
}
