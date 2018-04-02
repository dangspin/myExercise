class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int[] ans = new int[5];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int index = numEdge(grid, i, j);
                    ans[index] ++;
                }
            }
        }
        
        int res = 0;
        
        for (int i = 0; i < 5; i++) {
            res = res + ans[i]*(i);
        }
        
        return res;
        
    }
    
    public int numEdge(int[][] grid, int r, int c) {
        int[][] d = new int[][] {{0,-1}, {-1,0}, {0,1}, {1,0}};
        
        int m = grid.length;
        int n = grid[0].length;
        
        int res = 0;
        
        for(int k=0; k<d.length; k++) {
            int x=r+d[k][0], y=c+d[k][1];
            if(x<0 || x>=m || y<0 || y>=n || grid[x][y] == 0)
                res++;
        }
        
        return res;
    }
}
