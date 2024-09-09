package org.dsa.dsa.hashmap.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(6);
        map.put(1, 2);
        map.put(1, 3);
        map.put(3, 4);
        map.put(4, 4);
        map.put(5, 4);
        map.put(6, 4);
        map.put(7, 4);
        map.print();
        System.out.println(map.get(1));//3
        System.out.println(map.get(4));//null
        System.out.println(map.remove(3));//4
        System.out.println(map.containsKey(3));//false
        System.out.println(map.containsKey(1));//true
        map.print();//1 3
        System.out.println(map.size());//1
        System.out.println(map.isEmpty());//false

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> collect = Arrays.stream(nums1).boxed().filter(n -> Arrays.stream(nums2)
                        .noneMatch(n2 -> n2 == n)).distinct()
                .collect(Collectors.toList());
        List<Integer> collect1 = Arrays.stream(nums2).boxed().filter(n -> Arrays.stream(nums1)
                        .noneMatch(n2 -> n2 == n)).distinct()
                .collect(Collectors.toList());
        listList.add(collect);
        listList.add(collect1);
        return listList;
    }
}
