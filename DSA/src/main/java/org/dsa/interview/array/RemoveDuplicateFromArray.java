package org.dsa.interview.array;

import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,7,6,5,2,3,4,5};
        System.out.println(Arrays.toString(remove1(array)));
        System.out.println(Arrays.toString(remove2(array)));
        System.out.println(Arrays.toString(remove3(array)));
    }

    //using Stream api
    private static int[] remove1(int[] array) {
        //IntStream.of(array).distinct().toArray();
       return Arrays.stream(array).distinct().toArray();
    }
    private static int[] remove2(int[] array) {

        //Set<Integer> set = new HashSet<>();
        // Using LinkedHashSet (Order preserved)
        Set<Integer> linkedSet = new LinkedHashSet<>();
        for (int i : array) {
            linkedSet.add(i);
        }

        return linkedSet.stream().mapToInt(Integer::intValue).toArray();
    }

    //Using List
    private static int[] remove3(int[] array) {
        List<Integer> rs = new ArrayList<>();
        for (int i : array) {
            if (!rs.contains(i)){
                rs.add(i);
            }
        }
        int[] newArray = new int[rs.size()];
        for (int i = 0; i < rs.size(); i++) {
            newArray[i] = rs.get(i);
        }
        return newArray;
    }
}
