package com.DynamicProgram;

import java.util.Arrays;

public class CombinationSum4 {
    private int[] dp;
    /**
     * 递归解法：TLE
     * @param nums
     * @param target
     * @return
     */
    private int combinationSum4_recur(int[] nums, int target){
        int sum = 0;
        for(int i : nums){
            if(i == target) sum += 1;
            else if(i < target) sum += combinationSum4_recur(nums, target - i);
        }
        return sum;
    }

    private int combinationSum4_dp(int[] nums, int target){
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target);
    }

    private int helper(int[] nums, int target){
        /**
         * dp记录到达索引指示的target有几种方案去解决
         * 就是相当于记住它的中间结果！！！
         */
        if (dp[target] != -1) {
            return dp[target];
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += helper(nums, target - nums[i]);
            }
        }
        dp[target] = res;
        return res;
    }


    public static void main(String[] args) {
        CombinationSum4 combinationSum4 = new CombinationSum4();
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(combinationSum4.combinationSum4_dp(nums, target));
    }
}
