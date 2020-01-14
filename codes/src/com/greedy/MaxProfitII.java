package com.greedy;


public class MaxProfitII {
    private static int maxProfitII(int[] prices){
        if(prices.length == 0) return 0;
        int max = 0;
        for (int i = 1 ; i < prices.length ; i++){
            if(prices[i] > prices[i-1]) max += prices[i] - prices[i-1];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfitII(new int[]{7,1,5,3,6,4}));
    }
}
