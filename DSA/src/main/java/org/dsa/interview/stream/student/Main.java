package org.dsa.interview.stream.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of StudentDTO objects
        List<StudentDTO> students = new ArrayList<>();

        // Adding student data to the list
        students.add(new StudentDTO("John Doe", 20, 101));
        students.add(new StudentDTO("Jane Smith", 21, 102));
        students.add(new StudentDTO("Michael Brown", 19, 103));
        students.add(new StudentDTO("Nichael Brown", 19, 103));

        students.stream().sorted(Comparator.comparing(StudentDTO::getAge).reversed()
                .thenComparing(StudentDTO::getName,Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
