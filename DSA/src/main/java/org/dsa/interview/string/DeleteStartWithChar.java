package org.dsa.interview.string;


//Remove the closest non-star character to its left, as well as remove the star itself.
public class DeleteStartWithChar {

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));//lecoe
    }

    private static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        char[] str = s.toCharArray();
        for (char c : str) {
            if (c == '*')
                sb.deleteCharAt(sb.length() - 1); //last character from StringBuilder
            else
                sb.append(c);//add current character
        }
        return sb.toString();
    }
}
