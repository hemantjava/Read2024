package org.dsa.interview.cloning;

import java.util.List;

public class Person {
    private final String name;
    private final int age;
    private final List<String> hobbies; //Object, array, collection type field

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}