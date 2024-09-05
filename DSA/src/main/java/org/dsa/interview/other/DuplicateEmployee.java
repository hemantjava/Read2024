package org.dsa.interview.other;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateEmployee {

    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee(1, "Hemant"), new Employee(2, "Hemant"));

        Map<String, Long> collect = list.stream().map(Employee::getName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(e -> e.getValue() >= 2).forEach(System.out::println);
    }


}
