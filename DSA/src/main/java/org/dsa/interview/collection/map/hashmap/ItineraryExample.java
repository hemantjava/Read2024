package org.dsa.interview.collection.map.hashmap;

import java.util.*;
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
        System.out.println("================================================");
        getPaths();
    }

    private static void getPaths(Map<String, String> map) {
        //Getting starting point from FROM which not present in To side
        String start = map.entrySet().stream().filter(e -> !map.values().contains(e.getKey()))
                .map(Map.Entry::getKey).findAny().orElse("");
        for (int i = 0; i < map.size(); i++) {
            System.out.print(start + "-->");
            start = map.get(start);
        }
        System.out.print(start);
    }

    private static String getPathsList(Map<String, String> map) {
        //Getting starting point from FROM which not present in To side
        String start = map.keySet().stream().filter(e -> !map.values().contains(e))
                .findAny().orElse("");
        List<String> stringList = new ArrayList<>(map.size());//added in list
        stringList.add(start);
        for (int i = 0; i < map.size(); i++) {
            start = map.get(start);
            stringList.add(start);
        }
        return stringList.stream().collect(Collectors.joining("===>"));
    }

    private static void getPaths() {
        Map<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = "";
        for (String key : map.keySet()) {
            if (!map.values().contains(key)) {//key doesn't exist in values that is starting point
                start = key;
            }
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.print(start + "-->");
            start = map.get(start);
        }
        System.out.println(start);
    }
}
