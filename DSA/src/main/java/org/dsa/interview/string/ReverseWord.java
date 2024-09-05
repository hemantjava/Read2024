package org.dsa.interview.string;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "hemant kumar  sahu";
        System.out.println(reverseWord(str));
        System.out.println(reverseWordBuilder(str));
    }

    private static String reverseWord(String str) {
        String[] split = str.split("\\s+");
        int right = split.length - 1;
        int left = 0;
        while (left<right){
            String temp = split[left];
            split[left] = split[right];
            split[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",split);
    }

    private static String reverseWordBuilder(String str) {
        String[] split = str.split("\\s+");
        StringBuilder sb  = new StringBuilder();
        for (int i = split.length-1; i >= 0 ; i--) {
            sb.append(split[i]);
            if (i < split.length)
            sb.append(" ");
        }
        return sb.toString();
    }
}
