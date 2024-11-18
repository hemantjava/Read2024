package org.dsa.interview.number;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) { //out of range
                return 0; // Return 0 if overflow/underflow occurs
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Reversed: " + reverse(-12345)); // Output: -54321
        System.out.println("Reversed: " + reverse(123450)); // Output: 54321
    }
}
