package com.DynamicProgram;

import java.util.Arrays;

public class RobII {
    private int robII(int[] nums){
        if(nums==null||nums.length==0)
            return 0;
        int n=nums.length;
        if(n==1)
            return nums[0];
        return Math.max(helper(0,n-2,nums),helper(1,n-1,nums));
    }
    private int helper(int start, int end, int[] nums){
        int[]dp=new int[end-start+2];
        dp[0]=0;
        dp[1]=nums[start];
        for(int i=2;i<=(end-start+1);i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1+start]);
        }
        return dp[end-start+1];
    }

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(new RobII().robII(nums));
    }
}
