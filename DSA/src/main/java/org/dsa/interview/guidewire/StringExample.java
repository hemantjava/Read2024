package org.dsa.interview.guidewire;

public class StringExample {
    public static void main(String[] args) {
        String S = "123458"; //698
        String result = getSolution(S);
        System.out.println(result);
    }

    private static String getSolution(String S) {
        StringBuilder sb = new StringBuilder(S);
        boolean replace = true;
        while (replace) {
            replace = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                int a = sb.charAt(i) - '0';
                int b = sb.charAt(i + 1) - '0';
                if (a + b <= 9) {
                    sb.replace(i, i + 2, String.valueOf(a + b));
                    replace = true;
                    break;
                }
            }
        }
        return sb.toString();
    }
}
