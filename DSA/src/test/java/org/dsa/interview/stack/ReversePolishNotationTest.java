package org.dsa.interview.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationTest {

    @Test
    void notation() {
        String[] str = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int notation = ReversePolishNotation.notation(str);
        String[] tokens = {"2","1","+","3","*"};
        int notation1 = ReversePolishNotation.notation(tokens);
        System.out.println(notation);
        System.out.println(notation1);
    }
}