package org.dsa.interview.string;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));//leotcede

    }

    private  static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move left pointer if it's not a vowel
            if (!vowels.contains(chars[left] + "")) {
                left++;
            }
            // Move right pointer if it's not a vowel
            else if (!vowels.contains(chars[right] + "")) {
                right--;
            }
            // If both are vowels, swap and move pointers
            else { // this block only execute when all 2 above block false
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

}
