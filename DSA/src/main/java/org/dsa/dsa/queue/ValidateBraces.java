package org.dsa.dsa.queue;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateBraces {
    public static void main(String[] args) {

        System.out.println(validate("{[()]}"));
        System.out.println(validate("[]{}()"));
        System.out.println(validate("[]{})"));
        System.out.println(validate("{(a[b]c)d}"));

    }

    private static String validate(String input) {
        Deque<Character> q = new LinkedList<>();
        for (Character c : input.toCharArray()) {
            if (c == '[' || c == '(' || c == '{')
                q.add(c);
            else if (c == ']' || c == ')' || c == '}') {
                if (q.isEmpty() || !pair(q.removeLast(), c))
                    return "UNBALANCED";
            }
        }
        return q.isEmpty() ? "BALANCED" : "UNBALANCED";
    }

    private static boolean pair(char opening, char closing) {
        return (opening == '[' && closing == ']') || (opening == '{' && closing == '}') || (opening == '(' && closing == ')');
    }
}
