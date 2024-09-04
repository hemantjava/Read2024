package org.dsa.interview.array;

public class ClosestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 7, 9, 6};
        int target = 10;

        int closestNumber = findClosest(numbers, target);

        System.out.println("Closest number to " + target + " is " + closestNumber);

    }

    private static int findClosest(int[] array, int target) {
        int closest = array[0];
        int distance = target - closest;
        for (int i = 1; i < array.length; i++) {
            int current = target - array[i];
            if (current < distance) { //find minimum distance
                closest = array[i]; // number what we are looking
                distance = current;//swapping minimum distance
            }

        }

        return closest;
    }
}
