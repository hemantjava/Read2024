package org.dsa.interview.number;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); // To detect cycles

        while (!seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
            if (n == 1)
                return true;
        }
        return false; // Reached 1
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            sum += digit * digit; // Add square of digit
            n /= 10; // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 19; // Example 1
        System.out.println("Is " + n1 + " a happy number? " + isHappy(n1)); // Output: true

        int n2 = 2; // Example 2
        System.out.println("Is " + n2 + " a happy number? " + isHappy(n2)); // Output: false
    }
}
