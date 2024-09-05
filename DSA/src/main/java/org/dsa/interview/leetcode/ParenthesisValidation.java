package org.dsa.interview.leetcode;

import java.util.Stack;

public class ParenthesisValidation {

    public static void main(String[] args) {
        System.out.println(validate("({a+b}{c*d})"));
    }

    public static boolean validate(String input) {
        final Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for (Character ch : charArray) {
            if (open(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty()) {
               return false;
            }else if (map(ch, stack.peek())){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static boolean map(Character ch, Character op) {
        return (op == '(' && ch == ')') || (op == '{' && ch == '}') || (op == '[' && ch == ']');
    }

    private static boolean open(Character ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
}
