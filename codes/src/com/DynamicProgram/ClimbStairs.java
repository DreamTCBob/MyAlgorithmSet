package com.DynamicProgram;

import java.util.Arrays;

public class ClimbStairs {
    private int[] dp;
    private int climbStairs(int n){
        if (n <= 1) return 1;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        int[] nums = {1, 2};
        return helper(nums, n);
    }

    private int helper(int[] nums, int n){
        if(dp[n] != -1) return dp[n];
        int sum = 0;
        for (int i : nums){
            if(n >= i) sum += helper(nums, n - i);
        }
        dp[n] = sum;
        return dp[n];
    }

    /**
     * 优化考虑，状态只与前两个状态相关，边记边忘
     * @param n
     * @return
     */
    private int climbTwo(int n){
        if(n <= 2){
            return n;
        }
        int pre1 = 2, pre2 = 1;
        for (int i = 2 ; i < n ; i++){
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbTwo(4));
    }
}
