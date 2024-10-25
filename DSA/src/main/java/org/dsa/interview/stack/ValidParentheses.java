package com.example.corejava.leetCode;

import java.util.Stack;

/**
 * Time Complexity
 * The time complexity of the code is O(n), where n is the length of the input string s.
 * <p>
 * The code iterates through each character in the string once (for (char c : s.toCharArray())), which takes O(n) time.
 * Each push or pop operation on the stack takes O(1) time. Therefore, the total time complexity is determined by the iteration over the input string.
 * Space Complexity
 * The space complexity of the code is O(n).
 * <p>
 * In the worst case, if the input string contains only opening brackets (like "[[[{{("), all characters will be pushed onto the stack. In this scenario, the stack will store up to n characters, resulting in O(n) space complexity.
 * If the string is valid and every opening bracket has a corresponding closing bracket, the stack will be empty by the end, but in terms of space allocation, we still consider the worst-case scenario, which is O(n).
 * Summary
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        // Check for empty string and should have at least 2 length chars
        if (s.isBlank() || s.length() < 2)
            return false;
        // Create a stack to store opening parentheses
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(')
                stack.push(c);
            else {
                //looks for closing braces, pop the last element from stack
                if (stack.isEmpty() || !isMatching(stack.pop(), c))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    // Helper method to check if two parentheses are matching
    private static boolean isMatching(char opening, char closing) {
        return (opening == '[' && closing == ']') || (opening == '(' && closing == ')') || (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));//true
        System.out.println(isValid("(){}[])"));//false
        System.out.println(isValid("(){[}]"));//false
        System.out.println(isValid(""));//false
        System.out.println(isValid(" "));//false
    }
}

