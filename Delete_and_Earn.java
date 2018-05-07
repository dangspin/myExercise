class Solution {
    public int deleteAndEarn(int[] nums) {
    
    // This problem is actual very easy to programm, but the problem itself is hard to understand, somehow, I think it is
    // very confusing.
        int n = 10001;
        int[] count = new int[n];
        
        for (int num:nums) {
            count[num] = count[num] + 1;
        }
        
        int[] dp = new int[n];
        dp[1] = count[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-2] + i*count[i], dp[i-1]);
        }
        
        return dp[n-1];
    }
}
