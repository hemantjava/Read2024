package org.dsa.interview.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "hemant kumar  sahu";
        System.out.println(reverseWord(str));
        System.out.println(reverseWordBuilder(str));
        System.out.println(reverseWordStream(str));
    }

    //Using two pointers
    private static String reverseWord(String str) {
        String[] split = str.split("\\s+"); //s+ '+' symbol taken case extra space
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

    //StringBuilder reverse the array
    private static String reverseWordBuilder(String str) {
        String[] split = str.split("\\s+");
        StringBuilder sb  = new StringBuilder();
        for (int i = split.length-1; i >= 0 ; i--) {
            sb.append(split[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    //Using Stream API
    private static String reverseWordStream(String str) {
       return Arrays.stream(str.split("\\s+"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(" "));
    }
}
