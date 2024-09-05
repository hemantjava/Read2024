package org.dsa.interview.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItineraryExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        //from  -> to
        getPaths(map);
        System.out.println("\n=================");
        System.out.println(getPathsList(map));
    }

    private static void getPaths(Map<String, String> map) {
        //Getting starting point from FROM which not present in To side
        String start = map.entrySet().stream().filter(e -> !map.values().contains(e.getKey()))
                .map(Map.Entry::getKey).findAny().orElse("");
        for (int i = 0; i < map.size(); i++) {
            System.out.print(start+"-->");
            start = map.get(start);
        }
        System.out.print(start);
    }

    private static String getPathsList(Map<String, String> map) {
        //Getting starting point from FROM which not present in To side
        String start = map.entrySet().stream().filter(e -> !map.values().contains(e.getKey()))
                .map(Map.Entry::getKey).findAny().orElse("");
        List<String> stringList = new ArrayList<>(map.size());//added in list
        for (int i = 0; i < map.size(); i++) {
            stringList.add(start);
            start = map.get(start);
        }
        stringList.add(start);
        return stringList.stream().collect(Collectors.joining("===>"));
    }

}
