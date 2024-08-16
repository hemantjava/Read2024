package org.dsa.design.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .name("hemant")
                .address("blr")
                .build();

        System.out.println(student);
    }
}
