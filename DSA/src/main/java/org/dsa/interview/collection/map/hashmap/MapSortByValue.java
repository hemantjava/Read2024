package org.dsa.interview.collection.map.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortByValue {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("a",4);
        map.put("b",2);
        map.put("c",5);
        map.put("d",1);
     //   System.out.println(map);
        sortByValue(map);
       // sortByValueReverse(map);

    }

    private static  void sortByValue(Map<String,Integer> map){
        Map<String, Integer> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(v1,v2)->v1, LinkedHashMap::new));
        System.out.println(map1);
    }

    private static  void sortByValueReverse(Map<String,Integer> map){
        Map<String, Integer> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(v1,v2)->v1, LinkedHashMap::new));
        System.out.println(map1);
    }
}
