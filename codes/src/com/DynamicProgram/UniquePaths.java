package com.DynamicProgram;

import java.util.Arrays;

public class UniquePaths {
    private int[][] dp;
    private int uniquePaths(int m , int n){
        if(m == 0 || n == 0) return 0;
        if(m == 1 || n == 1) return 1;
        dp = new int[m+1][n+1];
        for (int i = 0 ; i <= m ; i++){
            Arrays.fill(dp[i], -1);
        }
        Arrays.fill(dp[0], 0);
        for(int i = 0 ; i <= m ; i++){
            dp[i][0] = 0;
        }
        for(int i = 1 ; i <= m ; i++){
            dp[i][1] = 1;
        }
        Arrays.fill(dp[1], 1);
        return helper(m, n);
    }
    private int helper(int m, int n){
        if(dp[m][n] != -1) return dp[m][n];
        /**
         * 边界检测
         */
        if(m > 1 && n > 1) dp[m][n] = helper(m-1, n) + helper(m, n-1);
        return dp[m][n];
    }

    private int uniquePathsII(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(7,3));
    }
}
