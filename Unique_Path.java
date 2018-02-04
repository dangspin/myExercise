public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    // public int uniquePaths(int m, int n) {
    //     // write your code here 
    //     int [][] path=new int[m][n];
        
    //     for (int i=0;i<m;i++){
    //         path[i][0]=1;
    //     }
        
    //     for (int j=0;j<n;j++){
    //         path[0][j]=1;
    //     }
        
    //     for (int i=1;i<m;i++){
    //         for (int j=1;j<n;j++){
    //             path[i][j]=path[i][j-1]+path[i-1][j];
    //         }
    //     }
        
    //     return path[m-1][n-1];
    // }
    
    public int uniquePaths(int m, int n) {
        // Recursive version
        if (m == 0 || n == 0) {return 0;}
        if (m == 1 || n == 1) {return 1;}
        
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

}
