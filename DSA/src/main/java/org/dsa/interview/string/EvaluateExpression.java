package org.dsa.interview.string;

import java.util.Arrays;

public class EvaluateExpression {
    public static void main(String[] args) {
        String expression = "10x20/2x5/4x2";
        int result = evaluateExpression(expression);
        System.out.println(expression + " = " + result);
    }

    public static int evaluateExpression(String expression) {
        String[] terms = expression.split("/");

        return Arrays.stream(terms)
                .map(EvaluateExpression::evaluateTerm)//200,10,8
                .reduce((a, b) -> a / b)
                .orElse(0);
    }

    public static int evaluateTerm(String term) {
        String[] factors = term.split("x");

        return Arrays.stream(factors)
                .mapToInt(Integer::parseInt)
                .reduce((a, b) -> a * b)
                .orElse(1);

    }
}
