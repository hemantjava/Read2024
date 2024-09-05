package org.dsa.dsa.hashmap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
       // map.print();

        map.put("AS", 3);
        map.put("SA", 1);
        map.put("H", 4);
        map.print();
        System.out.println(map.get("AS"));
        map.remove("AS");
       // map.print();

    }
}
