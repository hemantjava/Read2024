package org.dsa.interview.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        nums.add(1);
        System.out.println("Before:"+nums);//Before:[1, 2, 3, 4, 4, 5, 1]
        System.out.println("After:"+removeDuplicates(nums));//After:[1, 2, 3, 4, 5]
        System.out.println("After:"+removeDuplicates1(nums));
        System.out.println("After:"+removeDuplicates2(nums));
    }

    //By Using distinct() method of stream api
    public static List<Integer> removeDuplicates(List<Integer> nums) {
        return nums.stream().distinct().toList();
    }

    //By Using contains method of other List
    public static List<Integer> removeDuplicates1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        nums.forEach( d->{
            if (!result.contains(d))
                result.add(d);
        });
        return result;
    }

    //By set then list
    public static List<Integer> removeDuplicates2(List<Integer> nums) {

        return nums.stream().collect(Collectors.toSet()).stream().toList();
    }
}
