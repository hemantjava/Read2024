package org.dsa.interview.stream.student;

public class StudentDTO {
    private String name;
    private int age;
    private int roll;

    // Constructors
    public StudentDTO() {}

    public StudentDTO(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                '}';
    }
}

