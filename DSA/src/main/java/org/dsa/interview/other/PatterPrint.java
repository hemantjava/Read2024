package org.dsa.interview.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatterPrint {
    public static void main(String[] args) {

        List<String> input_list = List.of("John", "Mark", "Juli", "Bob", "Rick", "John", "Juli");
        //output_list=[John_1,Mark_1,Juli_1,Bob_1,Rick_1,John_2,Juli_2]

        System.out.println(printPatterns(input_list));
    }

    private static List<String> printPatterns(List<String> patterns) {
        List<String> output = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String pattern : patterns) {
            map.put(pattern, map.getOrDefault(pattern, 0) + 1);
            output.add(pattern+"_"+map.get(pattern));
        }
        return output;
    }
}
