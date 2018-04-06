class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 1) continue;
                
                max = Math.max(count(grid, i, j), max);
            }
        }
        return Math.max(0, max);
    }
    
    public int count(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (i < 0 || i>= m || j < 0 || j >= n) {
            return 0;
        }
        
        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1+ count(grid, i-1, j)+count(grid, i+1, j)+ count(grid, i, j-1)+ count(grid, i, j+1);
        } else {
            return 0;
        }
    }
}
