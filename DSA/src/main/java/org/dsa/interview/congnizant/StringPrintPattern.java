package org.dsa.interview.congnizant;

public class StringPrintPattern {
    public static void main(String[] args) {
        String str = "aacccccbaaa";
        System.out.println(getPattern(str));//a2c5b1a3
    }

    public static String getPattern(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        int current = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == current) {
                count++;
            }else {
                sb.append(str.charAt(i-1)).append(count);
                current = str.charAt(i); // update for new character
                count = 1;

            }
        }
       sb.append(str.charAt(str.length()-1)).append(count); //last occurred char
       return sb.toString();
    }
}
