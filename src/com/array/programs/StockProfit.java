package com.array.programs;
public class StockProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } 
            else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        StockProfit sp = new StockProfit();

        System.out.println(sp.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // Output: 5
        System.out.println(sp.maxProfit(new int[]{1, 2, 3, 4, 5, 6, 7})); // Output: 6
        System.out.println(sp.maxProfit(new int[]{7, 6, 5, 4, 3, 2, 1})); // Output: 0
    }
}