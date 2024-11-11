package org.dsa.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExample {



    @Test
    @DisplayName("1. assertEquals - Verifies that two values are equal.")
    void testEquals() {
        int result = 5 + 5;
        assertEquals(10, result, "Result should be 10");
    }



    @Test
    @DisplayName("2. assertNotEquals - Verifies that two values are not equal.")
    void testNotEquals() {
        int result = 5 + 5;
        assertNotEquals(11, result, "Result should not be 11");
    }

    @Test
    @DisplayName("3. assertTrue - Verifies that a condition is true")
    void testTrue() {
        boolean isAdult = true;
        assertTrue(isAdult, "Person should be an adult");
    }

    @Test
    @DisplayName("4. assertFalse - Verifies that a condition is false")
    void testFalse() {
        boolean isMinor = false;
        assertFalse(isMinor, "Person should not be a minor");
    }

    @Test
    @DisplayName("5. assertNull - Verifies that an object is null")
    void testNull() {
        Object obj = null;
        assertNull(obj, "Object should be null");
    }

    @Test
    @DisplayName("6. assertNotNull - Verifies that an object is not null")
    void testNotNull() {
        String str = "Hello";
        assertNotNull(str, "String should not be null");
    }

    @Test
    @DisplayName("7. assertThrows - Verifies that a specific exception is thrown")
    void testThrows() {
        assertThrows(ArithmeticException.class, () -> {
            int division = 1 / 0;
        }, "Should throw ArithmeticException");
    }

    @Test
    @DisplayName("8. assertDoesNotThrow - Verifies that no exception is thrown")
    void testDoesNotThrow() {
        assertDoesNotThrow(() -> {
            int division = 1 / 1;
        }, "Should not throw any exception");
    }

    @Test
    @DisplayName("9. assertIterableEquals - Verifies that two iterables are equal.")
    void testIterableEquals() {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("A", "B", "C");
        assertIterableEquals(list1, list2, "Lists should be equal");
    }

    @Test
    @DisplayName("10. assertArrayEquals - Verifies that two arrays are equal.")
    void testArrayEquals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assertArrayEquals(array1, array2, "Arrays should be equal");
    }

    @Test
    @DisplayName("11. assertAll - Groups multiple assertions together, and if any fail, they’re all reported at once")
    void testAll() {
        String str = "JUnit";
        assertAll("Test all assertions",
                () -> assertEquals("JUnit", str),
                () -> assertNotNull(str)
        );
    }

    @Test
    @DisplayName("12. assertSame - Verifies that two object references point to the same object.")
    void testSame() {
        String str1 = "Hello";
        String str2 = str1;
        assertSame(str1, str2, "References should be the same");
    }

    @Test
    @DisplayName("13. assertNotSame - Verifies that two object references do not point to the same object")
    void testNotSame() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        assertNotSame(str1, str2, "References should not be the same");

    }

    @Test
    @DisplayName("14. assertTimeout - Verifies that a block of code completes within the specified timeout")
    void testTimeout() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(500); // Simulated task within timeout
        }, "Should complete within timeout");
    }

    @Test
    @DisplayName("15. assertTimeoutPreemptively - Similar to assertTimeout, but the task is aborted if it exceeds the timeout")
    void testTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            Thread.sleep(500); // Task within preemptive timeout
        }, "Should complete within preemptive timeout");
    }
    }
