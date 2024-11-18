package org.dsa.interview.number;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-8856));//-6588
    }

    public static int reverse(int x) {
        int INT_MAX = Integer.MAX_VALUE, INT_MIN = Integer.MIN_VALUE;
        int reversed_x = 0;
        while (x != 0) {
            int pop = x % 10; // pop last digit
            x /= 10;// update x after removing th last digit
            if (reversed_x > INT_MAX / 10 || (reversed_x == INT_MAX / 10 && pop > 7)) return 0;
            if (reversed_x < INT_MIN / 10 || (reversed_x == INT_MIN / 10 && pop < -8)) return 0;
            reversed_x = reversed_x * 10 + pop;
        }
        return reversed_x;
    }
}