package com.DynamicProgram;

import java.util.Arrays;

public class NumDecodings {
    int[] dp;
    private int numDecodings(String s){
        if(s.length() == 0) return 0;
        if(s.charAt(0) == '0') return 0;
        if(s.length() == 1) {
            if (s.charAt(0) == '0') return 0;
            else return 1;
        }
        dp = new int[s.length()+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(s, s.length());
    }

    private int helper(String s, int n){
        if(dp[n] != -1) return dp[n];
        int sum = 0;
        for(int i = 1 ; i <= 2 ; i++){
            if(i == 1){
                if(s.charAt(n-1) != '0'){
                    sum = sum + helper(s, n - 1);
                }
            }else {

                if(n < 2) break;
                if(s.charAt(n-2) == '0') break;//也不能是00
                if(Integer.parseInt(s.substring(n-2, n)) > 26) break;
                else sum = sum + helper(s, n-2);
            }
        }
        dp[n] = sum;
        return dp[n];
    }

    public static void main(String[] args) {
        NumDecodings numDecodings =  new NumDecodings();
        System.out.println(numDecodings.numDecodings("00"));
    }
}
