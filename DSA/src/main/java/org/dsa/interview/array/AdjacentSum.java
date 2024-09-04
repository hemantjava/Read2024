package org.dsa.interview.array;

public class AdjacentSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 2};//3
        System.out.println(findAdjacentSum(array));
    }
    private static int findAdjacentSum(int[] numbers) {
        final var size = numbers.length;
        if (size < 3)
            return -1;
        for (int i = 0; i <= size - 3; i++) {
            if ((numbers[i] + numbers[i + 2]) == numbers[i + 1])
                return i + 1;
        }
        return -1;
    }
}
