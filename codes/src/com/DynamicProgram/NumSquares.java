package com.DynamicProgram;

import java.util.ArrayList;
import java.util.List;

public class NumSquares {

    private int numSquares(int n){
        int[] dp = new int[n+1];
        List<Integer> list = generateSquareList(n);
        dp[0] = 0;
        /**
         * 遍历存储每一个数的最小组合
         */
        for(int i = 1 ; i <= n ; i++){
            int min = Integer.MAX_VALUE;
//            for (int j = list.size() - 1 ; j >= 0 ; j--){
//                int now = list.get(j);
//                if(now > i)
//                    continue;
//                min = Math.min(min, dp[i - now] + 1);
//            }
            for(int j : list){
                if(j > i)
                    break;
                min = Math.min(min, dp[i - j] + 1);
            }
            dp[i] = min;
        }
        return dp[n];
    }

    private List<Integer> generateSquareList(int n) {
        List<Integer> squareList = new ArrayList<>();
        int square = 1;
        int i = 1;
        while (square <= n){
            squareList.add(square);
            square = (i+1)*(i+1);
            i += 1;
        }
        return squareList;
    }

    private int numSquaresMyWrong(int n){
        /**
         * 我这种算法没有记忆功能
         * 类似于贪心思想，但是没法判断贪心的结果是正确的
         * 要能记忆下来以前的那种情况是最优的
         */
        if(n <= 0) return 0;
        return numSquaresMyWrong(n - ((int) Math.sqrt(n) * (int) Math.sqrt(n))) + 1;
    }

    public static void main(String[] args) {
        NumSquares numSquares = new NumSquares();
        System.out.println(numSquares.numSquares(12));
    }

}
