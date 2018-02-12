public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
        
        // This is a very typicakl dynamic programming problem.
        // The key point is the transition states equation. We need to be careful, that 
        // We must subtract the value A[i] from j first, then add it again. Other wise,
        // it will be beyond the total capacity. It is not really hard to figure it out.
        
        if (A.length == 0 || m == 0) {return 0;}
        
        int n = A.length;
        
        int[][] dp = new int[n+1][m+1];
        
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=m; j++) {
                if (A[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-A[i-1]] + A[i-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }
}
