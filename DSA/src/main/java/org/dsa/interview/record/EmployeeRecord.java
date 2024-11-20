package org.dsa.interview.record;

public record EmployeeRecord(int id, int age, String firstName, String lastName) {

    public static final int VALUE = 10;
    public String upperCAse(){
        return firstName.toUpperCase();
    }

}
