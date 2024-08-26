package org.dsa.interview.stream;

public class SumOfNumberFromString {
    public static void main(String[] args) {
        String string = "1k3j6n7b1b1b2";
        System.out.println(getSum(string));
    }

    private static int getSum(String string) {
        return string.chars().filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }
}
