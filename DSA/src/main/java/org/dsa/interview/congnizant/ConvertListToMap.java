package org.dsa.interview.congnizant;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * To convert a List of emp objects into a Map where the id is the key and the name is the value
 */
public class ConvertListToMap {
    public static void main(String[] args) {

        List<Emp> emps = List.of(new Emp(1, "foo"), new Emp(2, "bar"), new Emp(3, "hem"));
        Map<Integer, String> mapArgs = emps.stream()
                .collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getName()));
        onlyMapArgs(mapArgs);
    }

    private static void onlyMapArgs(Map<Integer, String> mapArgs) {
        System.out.println(mapArgs);
    }
}
