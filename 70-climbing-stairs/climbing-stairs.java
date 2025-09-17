class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        if(n==1) return 1;
        fib(n,dp);
        return dp[n];

    }
    public int fib(int n, int[] dp){
        
        if(n<=1) return 1;
        
        if(dp[n] != 0) return dp[n];

        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
}