package com.LeetCodeJack.Problems;

public class P121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2)
            return 0;
        int lowestDay = prices[0];
        int maxSum = 0;
        for (int i = 1; i < prices.length; i++){
            if(prices[i] < lowestDay)
                lowestDay = prices[i];
            else
                maxSum = Math.max(maxSum, prices[i] - lowestDay);
        }
        return maxSum;
    }
}
