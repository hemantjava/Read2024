package org.dsa.string;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Hemant sahu";
        System.out.println(reverse(name));
        System.out.println(reverseString(name));
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int right = charArray.length - 1;
        int left = 0;
        while (left < right) {
            //swapping
            char temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

}
