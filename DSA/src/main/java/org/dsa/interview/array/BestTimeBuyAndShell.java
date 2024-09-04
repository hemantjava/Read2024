package org.dsa.interview.array;

public class BestTimeBuyAndShell {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {1, 2, 3, 4, 5};
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(7 == maxProfit(prices));
        System.out.println(4 == maxProfit(prices1));
        System.out.println(0 == maxProfit(prices2));
    }


    public static int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] < prices[i]) i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
    }
}
