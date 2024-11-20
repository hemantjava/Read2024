package org.dsa.interview.record;

public class Main {
    public static void main(String[] args) {

        //Normal java class
        HashCodeAndEquals hashCodeAndEquals = new HashCodeAndEquals(1,32,"hemant","sahu");
        System.out.println(hashCodeAndEquals.getFirstName()); //getter method
        System.out.println(hashCodeAndEquals);//toString method


        //Record in java
        EmployeeRecord employeeRecord = new EmployeeRecord(1,32,"hemant","sahu");
        System.out.println(employeeRecord.firstName());//getter method
        System.out.println(employeeRecord);//toString method
        System.out.println();


    }
}
