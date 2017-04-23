public class Solution {
    /**
     * @param n non-negative integer, n posts
     * @param k non-negative integer, k colors
     * @return an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // Write your code here
        if(n==0 || k==0) return 0;
          int[] dp = new int[n+1];
          dp[0] = 0;
          dp[1] = k;
          if (n == 1) return dp[1];
          dp[2] = k*k;
          if (n == 2) return dp[2];
         for (int i=3; i<=n; i++) {
             dp[i] = dp[i-1]*(k-1) + dp[i-2]*(k-1); // The idea is there are two possibilities, either i-1 and i are the same or i-2 and i are the same
             }
         return dp[n];
    }
}
