package org.dsa.interview.array.reverse;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void reverse() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        ReverseArray.reverse(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    void reverse1() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        ReverseArray.reverse1(array);
        System.out.println(Arrays.toString(array));
    }
}