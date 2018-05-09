class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];
        
        int i = 0;
        while ((i < m) && (obstacleGrid[i][0] != 1)) {
            dp[i][0] = 1;
            i++;
        }
        
        int j = 0;
        while ((j < n) && (obstacleGrid[0][j] != 1)) {
            dp[0][j] = 1;
            j++;
        }
        
        for (int row = 1; row < m; row++){
            for (int col = 1; col < n; col++){
                if (obstacleGrid[row][col] != 1) {
                    dp[row][col] = ((obstacleGrid[row-1][col] == 1)?0:dp[row-1][col]) + ((obstacleGrid[row][col-1] == 1)?0:dp[row][col-1]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
