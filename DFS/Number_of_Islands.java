public class Solution {
    /*
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        // write your code here
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;
        
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!grid[i][j]) continue;
                ans++;
                DFS(grid, i, j);
            }
        }
        return ans;
    }
    
    public void DFS(boolean[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i>= m || j < 0 || j >= n) {
            return;
        }
        
        if (grid[i][j]) {
            grid[i][j] = false;
            DFS(grid, i-1, j);
            DFS(grid, i+1, j);
            DFS(grid, i, j-1);
            DFS(grid, i, j+1);
        }
    }
}
