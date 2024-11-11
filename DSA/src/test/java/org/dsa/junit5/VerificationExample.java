package org.dsa.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
 class VerificationExample {

    @Test
    @DisplayName("1. verify() - Verifies that a method was called at least once")
    void testVerify() {
        List<String> mockedList = mock(List.class);
        mockedList.add("Hello");

        verify(mockedList).add(Mockito.anyString()); // Verifies add("Hello") was called
    }

    @Test
    @DisplayName("2. verify(...).times(n) - Verifies that a method was called exactly n times.")
    void testVerifyTimes() {
        List<String> mockedList = mock(List.class);
        mockedList.add("Hello");
        mockedList.add("Hell");
        verify(mockedList, times(2)).add(Mockito.anyString()); // Verifies add("Hello") was called twice
    }

    @Test
    @DisplayName("3. verify(...).never() - Verifies that a method was never called.")
    void testVerifyNever() {
        List<String> mockedList = mock(List.class);
        verify(mockedList, never()).add(Mockito.anyString()); // Verifies add("Hello") was never called
    }

    @Test
    @DisplayName("4. verify(...).atLeast(n) - Verifies that a method was called at least n times.")
    void testVerifyAtLeast() {
        List<String> mockedList = mock(List.class);
        mockedList.add("Hello");
        mockedList.add("Hello");
        verify(mockedList, atLeast(1)).add(Mockito.anyString()); // Verifies add("Hello") was called at least once
    }

    @Test
    @DisplayName("5. verify(...).atMost(n) - Verifies that a method was called at most n times.")
    void testVerifyAtMost() {
        List<String> mockedList = mock(List.class);
        mockedList.add("Hello");
        verify(mockedList, atMost(1)).add("Hello"); // Verifies add("Hello") was called at most twice
    }

    @Test
    @DisplayName("6. verify(...).only() - Verifies that a method was the only interaction with the mock.")
    void testVerifyOnly() {
        List<String> mockedList = mock(List.class);
        mockedList.add("Hello");

        verify(mockedList, only()).add("Hello"); // Verifies add("Hello") was the only interaction
    }

    @Test
    @DisplayName("7. verifyNoInteractions() - Verifies that there were no interactions with the mock.")
    void testVerifyNoInteractions() {
        List<String> mockedList = mock(List.class);
        verifyNoInteractions(mockedList); // Verifies no interaction with mockedList
    }

    @Test
    @DisplayName("8. verifyNoMoreInteractions() - Verifies that there are no further interactions beyond verified ones.")
    void testVerifyNoMoreInteractions() {
        List<String> mockedList = mock(List.class);
        mockedList.add("Hello");
        verify(mockedList).add("Hello");
        verifyNoMoreInteractions(mockedList); // Verifies no other interactions occurred
    }

    @Test
    @DisplayName("10. verify(...).timeout(long) - Verifies that a method is called within a certain timeout (for asynchronous calls).")
    void testVerifyTimeout() {
        List<String> mockedList = mock(List.class);

        // Simulate an asynchronous call
        new Thread(() -> mockedList.add("Hello")).start();
        verify(mockedList, timeout(1000)).add("Hello"); // Waits up to 1000ms for add("Hello") to be called
    }

    @Test
    @DisplayName("11. verify(...).timeout(long).times(n) - Verifies that a method was called a specified number of times within a timeout.")
    void testVerifyTimeoutTimes() {
        List<String> mockedList = mock(List.class);

        // Simulate an asynchronous call
        new Thread(() -> {
            mockedList.add("Hello");
            mockedList.add("Hello");
        }).start();
        verify(mockedList, timeout(1000).times(2)).add("Hello"); // Waits up to 1000ms for add("Hello") to be called twice
    }




}
