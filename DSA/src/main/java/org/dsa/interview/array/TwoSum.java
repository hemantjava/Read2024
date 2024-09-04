package org.dsa.interview.array;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class TwoSum {
    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        final var collect = Arrays.stream(nums).boxed().collect(toList());
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(findSubArray(nums, target)));
        System.out.println(findSum(collect, target));
        System.out.println(Arrays.toString(usingStreams(nums, target)));

    }

    //Returning indexes
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp))
                return new int[]{map.get(temp), i}; //get operation
            map.put(nums[i], i); // array element insert operation
        }
        return new int[]{-1};
    }

    //Returning values
    private static int[] findSubArray(int[] array, int target) {

        Set<Integer> set = new HashSet<>(); // Map is not required if we need values

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return new int[]{array[i]};
            int second = target - array[i];
            if (set.contains(second)) {
                return new int[]{second, array[i]};
            } else {
                set.add(array[i]);
            }
        }

        return new int[]{0};
    }

    //if exits return true orElse return false
    private static boolean findSum(List<Integer> ls, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ls.size(); i++) {
            int second = target - ls.get(i);
            if (set.contains(second)) {
                return true;
            } else {
                set.add(ls.get(i));
            }

        }
        return false;
    }

    private static int[] usingStreams(int[] numbers, int target) {
        return IntStream.range(0, numbers.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, numbers.length).mapToObj(j -> new int[]{i, j}))
                .filter(indices -> numbers[indices[0]] + numbers[indices[1]] == target)
                .findFirst().orElse(new int[]{0,0});
    }
}
