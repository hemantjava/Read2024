package org.dsa.interview.array;

import java.util.Arrays;

public class MinimumPlatforms {
    public static int findMinPlatforms(double[] arr, double[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platformsNeeded = 0;
        int trainsAtStation = 0;
        int arrIndex = 0;
        int depIndex = 0;

        while (arrIndex < arr.length) {
            if (arr[arrIndex] <= dep[depIndex]) {
                trainsAtStation++;
                arrIndex++;
                platformsNeeded = Math.max(platformsNeeded, trainsAtStation);
            } else {
                trainsAtStation--;
                depIndex++;
            }
        }

        return platformsNeeded;
    }

    public static void main(String[] args) {
        double[] arrival = {9, 9.40, 9.50, 11.00, 15.00, 18.00};
        double[] departure = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
        int minPlatforms = findMinPlatforms(arrival, departure);
        System.out.println(minPlatforms);  // Output: 3
    }
}