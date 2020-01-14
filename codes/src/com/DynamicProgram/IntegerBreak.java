package com.DynamicProgram;


public class IntegerBreak {
    /**
     * 每一个整数分解都与这个整数减一再去分解有关系，
     * 比如
     * 2=1+1
     * 3=1+1+1
     *  =1+2
     * 4=1+1+1+1
     *  =1+2+1
     *  =1+3
     *  =2+2
     * 那么当计算dp[4]时候，遍历到j=1时候 1+1+1和2+1是在dp[3]中计算过的，仅需再计算个3*1即可
     * 遍历到j=2时候 同样2=1+1也在dp[2]中计算过仅需再计算个2*2即可
     * 所以说这道题的难度在于找到加法分解时候相挨着的整数的共性！
     * @param n
     * @return
     */
    private int integerBreak(int n){
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();
        System.out.println(integerBreak.integerBreak(10));
    }
}
