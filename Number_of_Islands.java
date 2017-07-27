public class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                    res=res+1;
                }
            }
        }
        return res;
    }
    
    public void dfs(char[][] M, int i,int j){
        M[i][j]='0';
        
        for (int dx=-1;dx<=1;dx++){
            int x=i+dx;
            if (0<=x && x<M.length && M[x][j]=='1'){
                dfs(M,x,j);
            }
        }
        
        for (int dy=-1;dy<=1;dy++){
            int y=j+dy;
            if (0<=y && y<M[0].length && M[i][y]=='1'){
                dfs(M,i,y);
            }
        }
        
        return ;
    }
}
