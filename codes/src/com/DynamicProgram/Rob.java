package com.DynamicProgram;

import java.util.Arrays;

public class Rob {
    private int[] dp;

    private int rob(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return helper(nums, nums.length);
    }

    private int helper(int[] nums, int n){
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        dp[n] = Math.max(helper(nums, n - 1), helper(nums, n - 2) + nums[n-1]);
        return dp[n];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3};
        Rob rob = new Rob();
        System.out.println(rob.rob(nums));
    }
}
