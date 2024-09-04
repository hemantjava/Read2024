package org.dsa.interview.array;

public class FindSecondMin {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,8,8};
        System.out.println(getSecondMin(array));
    }

    private static int getSecondMin(int[] array) {
        if (array.length < 2)
            return -1;
        int min = Math.min(array[0], array[1]);
        int secondMin = Math.max(array[0], array[1]);

        for (int current : array) {
            if (current < min) {
                secondMin = min;
                min = current;
            } else if (current < secondMin && current != min) {
                secondMin = current;
            }
        }

        return secondMin;

    }

}
