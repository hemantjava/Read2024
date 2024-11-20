package org.dsa.interview.record;

import java.util.Objects;

public class HashCodeAndEquals {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

    public HashCodeAndEquals(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "HashCodeAndEquals{" +
                "id=" + id +
                ", age=" + age +
                ", firstName=" + firstName  +
                ", lastName=" + lastName  +
                '}';
    }

    //Here are hashcode and equals methods


    @Override
    public int hashCode() {
        return Objects.hash(id, age, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashCodeAndEquals that)) return false;
        return id == that.id && age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }
}
