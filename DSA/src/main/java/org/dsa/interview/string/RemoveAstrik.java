package org.dsa.interview.string;

public class RemoveAstrik {
    public static void main(String[] args) {
        String str = "sdf*ghf*bmd";

        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                sb.deleteCharAt(sb.length()-1);
                i = i+2;
            }
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
