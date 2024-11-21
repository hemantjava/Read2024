package org.dsa.interview.array;

public class BestTimeBuyAndSell {
    public static void main(String[] args) {
        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + maxProfit(prices2)); // Output: 0
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No profit can be made
        }
        int minPrice = prices[0]; // Track the minimum price seen so far
        int maxProfit = 0; //Track the maximum profit
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; //update the minPrice
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);//MaxProfit or new MaxProfit (prices[i] - minPrice)
            }
        }
        return maxProfit;
    }
}
