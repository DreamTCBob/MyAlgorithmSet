package com.DynamicProgram;

import java.util.Arrays;

public class MinPathSum {
    private int[][] dp;
    private int minPathSum(int[][] grid){
        if(grid == null) return 0;
        dp = new int[grid.length+1][grid[0].length+1];
        for (int[] g : dp){
            Arrays.fill(g, -1);
        }
        for(int i = 1 ; i <= grid.length ; i++){
            dp[i][0] = 0;
        }
        Arrays.fill(dp[0], 0);
        return helper(grid, grid.length, grid[0].length);
    }
    private int helper(int[][] grid, int i, int j){
        if(dp[i][j] != -1) return dp[i][j];
        /**
         * 边界判定
         */
        if(i > 1 && j > 1)
            dp[i][j] = Math.min(helper(grid, i-1, j) + grid[i-1][j-1], helper(grid, i, j-1) + grid[i-1][j-1]);
        else if(i > 1)
            dp[i][j] = helper(grid, i-1, j) + grid[i-1][j-1];
        else if(j > 1)
            dp[i][j] = helper(grid, i, j-1) + grid[i-1][j-1];
        else dp[i][j] = grid[i-1][j-1];
        return dp[i][j];
    }


    public static void main(String[] args) {
        MinPathSum minPathSum = new MinPathSum();
        int[][] grid = {{1}};
        System.out.println(minPathSum.minPathSum(grid));
    }
}
