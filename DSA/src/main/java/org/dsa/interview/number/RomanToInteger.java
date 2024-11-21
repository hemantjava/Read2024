package org.dsa.interview.number;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Map to store Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0; // Resulting integer value
        int prevValue = 0; // Value of the previous Roman numeral

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            // If current value is less than the previous value, subtract it (subtraction rule)
            if (currentValue < prevValue) {
                total -= currentValue;
            } else { // Otherwise, add the current value
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        String roman = "IV"; // Example: 1994
        int result = romanToInt(roman);
        System.out.println("The integer value of Roman numeral " + roman + " is: " + result);
    }
}
