package org.dsa.dsa.stack;


import java.util.Stack;

public class ValidateBraces {
    public static void main(String[] args) {

    }

    private static boolean validate(String str){
        final Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty() || !isPair(stack.pop(),c)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isPair(Character pop, Character peek) {
        return pop == '{' && peek == '}' || pop == '[' && peek == ']' || pop == '(' && peek == ')';
    }
}
