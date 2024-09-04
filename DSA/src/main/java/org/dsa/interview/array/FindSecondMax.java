package org.dsa.interview.array;

public class FindSecondMax {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 8, 8};
        System.out.println(getSecondMax(array));
    }

    private static int getSecondMax(int[] array) {
        if (array.length < 2)
            return -1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int current : array) {
            if (current > max) {
                secondMax = max;
                max = current;
            } else if (current > secondMax && current != max) {  //deduplicate number
                secondMax = current;
            }
        }
        System.out.println(max + " == " + secondMax);
        return secondMax;
    }
}
