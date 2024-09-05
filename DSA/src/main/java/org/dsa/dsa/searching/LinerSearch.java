package org.dsa.dsa.searching;
// Time complexity O(n)
public class LinerSearch {

    public static void main(String[] args) {
        int[] array = new int[]{1,6,9,3,5};

        //positive scenarios
        System.out.println(linerSearchElement(array,5));
        System.out.println(linerSearchIndex(array,5));

        //negative scenarios
        System.out.println(linerSearchElement(array,7));
        System.out.println(linerSearchIndex(array,7));

    }

    //Return search element if found or else return -1
    public static int linerSearchElement(int[] array, int target){
        for (int element : array) {
            if (element == target)
                return element;
        }
        return -1;
    }

    //Return index of search element if found or else return -1
    public static int linerSearchIndex(int[] array, int target){
        for (int i=0; i<array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}
