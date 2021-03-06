package com.LeetCodeJack.Problems;

public class P122_BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0)
                sum += prices[i] - prices[i - 1];
        }
        return sum;
    }
}
