package org.dsa.interview.string;

public class NumChar {
//write a program in java input  AAAAABBCCAA
//    out put 5A2B2C2A
    public static void main(String[] args) {
        String str ="AAAAABBCCAA";
        System.out.println(encode(str));
    }

    public static String encode(String inputString) {
        StringBuilder encodedStringBuilder = new StringBuilder();
        char currentChar = inputString.charAt(0);
        int currentCharCount = 1;

        for (int i = 1; i < inputString.length(); i++) {
            char nextChar = inputString.charAt(i);

            if (nextChar == currentChar) {
                currentCharCount++;
            } else {
                encodedStringBuilder.append(currentCharCount);
                encodedStringBuilder.append(currentChar);
                //swapping
                currentChar = nextChar;
                currentCharCount = 1;
            }
        }

        encodedStringBuilder.append(currentCharCount);
        encodedStringBuilder.append(currentChar);

        return encodedStringBuilder.toString();
    }

}
