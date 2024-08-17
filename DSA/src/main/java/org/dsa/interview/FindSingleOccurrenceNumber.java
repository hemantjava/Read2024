package org.dsa.interview;

//Without extra space;
public class FindSingleOccurrenceNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,1};
        System.out.println(singleOccurrence(arr));
    }

    private static int singleOccurrence(int[] arr) {
        int single = 0;
        for (int val:arr) {
            single ^= val;
        }
        return single;
    }
}
