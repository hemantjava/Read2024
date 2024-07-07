package org.dsa.string;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    /**
     * A PalindromeString reads the same forward and backward
     * @param str
     * @return boolean
     */
    //two pointer approach
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}