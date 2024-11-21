package org.dsa.interview.string;

import org.dsa.interview.congnizant.StringPrintPattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringPrintPatternTest {

    @Test
    void getPattern() {
        String str = "aacccccbaaa";
        Assertions.assertEquals("a2c5b1a3", StringPrintPattern.getPattern(str));
        Assertions.assertTrue(StringPrintPattern.getPattern("aacccccbaaa").length() < str.length());
    }
}