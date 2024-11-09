package org.dsa.interview.feature.java17;

import java.util.random.RandomGenerator;

public class RandomExample {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.getDefault();
        System.out.println(generator.nextInt(100));  // Random number between 0-99
        System.out.println(generator.nextInt(100));  // Random number between 0-99
    }
}
