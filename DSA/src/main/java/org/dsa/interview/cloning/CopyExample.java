package org.dsa.interview.cloning;

import java.util.ArrayList;
import java.util.List;

public class CopyExample {
    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Coding");

        Person originalPerson = new Person("Alice", 25, hobbies);

        // Shallow Copy
        //originalPerson.getHobbies() copy the reference
        Person shallowCopy = new Person(originalPerson.getName(), originalPerson.getAge(), originalPerson.getHobbies());

        // Deep Copy
        //new ArrayList<>(originalPerson.getHobbies()) copy the reference value
        Person deepCopy = new Person(originalPerson.getName(), originalPerson.getAge(), new ArrayList<>(originalPerson.getHobbies()));

        // Modify the original hobbies list
        hobbies.add("Gaming");
       //Modified changes reflected in shallow copy
        System.out.println("Original Person Hobbies: " + originalPerson.getHobbies());//[Reading, Coding, Gaming]
        System.out.println("Shallow Copy Hobbies: " + shallowCopy.getHobbies());//[Reading, Coding, Gaming]
        System.out.println("Deep Copy Hobbies: " + deepCopy.getHobbies());//[Reading, Coding]
    }
}
