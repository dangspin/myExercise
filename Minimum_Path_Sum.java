class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        for (int j = 1; j < grid[0].length; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        
        for (int m = 1; m < grid.length; m++) {
            for (int n = 1; n < grid[0].length; n++) {
                dp[m][n] = Math.min(dp[m-1][n], dp[m][n-1]) + grid[m][n];
            }
        }
        
        return dp[grid.length-1][grid[0].length-1];
    }
}
