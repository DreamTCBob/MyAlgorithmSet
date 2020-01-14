package com.DynamicProgram;


import java.util.concurrent.atomic.AtomicInteger;

public class TwoSubArray {
    public static boolean canPartition(int[] nums){
        if(nums.length == 1) return false;
        int volumn = 0;
        for (int num : nums) {
            volumn += num;
        }
        if (volumn % 2 != 0) {
            return false;
        }
        volumn /= 2;
        boolean[] dp = new boolean[volumn + 1];
        dp[0] = true;
        /**
         * 实际上，这是一个0/1背包问题，对于每个数字，我们可以选择是否选择。让我们假设dp [i] [j]表示是否可以从前i个数字中获得特定的和j。
         * 如果我们可以从0-i中选择一系列这样的数字，它们的总和为j，则dp [i] [j]为true，否则为false。
         */
        for (int i = 1; i <= nums.length; i++) {
            for (int j = volumn; j >= nums[i-1]; j--) {
                dp[j] = dp[j] || dp[j - nums[i-1]];
            }
        }
        return dp[volumn];
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
