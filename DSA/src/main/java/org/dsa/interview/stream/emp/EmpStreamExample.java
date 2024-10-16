package org.dsa.interview.stream.emp;

import java.util.Comparator;
import java.util.List;

public class EmpStreamExample {
    public static void main(String[] args) {
        List<Emp> empList = List.of(Emp.builder().name("hemant").salary(12333d).build(),
                Emp.builder().name("sahu").salary(13333d).build(),
                Emp.builder().name("kumar").salary(11333d).build(),
                Emp.builder().name("sarita").salary(10333d).build());

        String present = empList.stream()
                .sorted(Comparator.comparing(Emp::getSalary).reversed()).distinct()
                .skip(1).limit(1).findFirst()
                .map(Emp::getName).orElse("emp not present");
        System.out.println(present);
    }
}
