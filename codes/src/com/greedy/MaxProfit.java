package com.greedy;

public class MaxProfit {
    private static int maxProfit(int[] prices){
        int cnt = prices.length;
        if(cnt == 0) return 0;
        int minPrice = prices[0];
        int max = 0;
        for (int i = 0 ; i < prices.length ; i++){
            if(minPrice > prices[i]) minPrice = prices[i];
            max = Math.max(max, prices[i] - minPrice);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
