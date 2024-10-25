package org.dsa.interview.stack;


import java.util.Stack;

public class ReversePolishNotation {


    public static int notation(String[] str) {
        Stack<Integer> stack = new Stack<>(); // push integer value only

        for (String val : str) {
            if (val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(solve(operand2, operand1, val)); // operand2 is be the 1st
            } else {
                stack.push(Integer.parseInt(val)); // convert into integer and push
            }
        }
        return stack.pop();
    }

    private static int solve(int operand2, int operand1, String val) {
        return switch (val) {
            case "+" -> (operand2 + operand1);  //2nd operand then 1st operand
            case "-" -> (operand2 - operand1);
            case "/" -> (operand2 / operand1);
            case "*" -> (operand2 * operand1);

            default -> throw new IllegalStateException("Unexpected value: " + val);
        };
    }
}
