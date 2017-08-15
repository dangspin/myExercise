public class Solution {
    /**
     * @param n an integer
     * @return a square matrix
     */
    public int[][] generateMatrix(int n) {
        // Write your code here
        
        int [][] res=new int[n][n];
        
        int num=1;
        
        int rowbegin=0;
        int colbegin=0;
        int rowend=n-1;
        int colend=n-1;
        
        while (rowbegin<=rowend && colbegin<=colend){
            for (int i=colbegin;i<=colend;i++){
                res[rowbegin][i]=num;
                num++;
            }
            
            rowbegin++;
            
            for (int i=rowbegin;i<=rowend;i++){
                res[i][colend]=num;
                num++;
            }
            
            colend--;
            
            for (int i=colend;i>=colbegin;i--){
                res[rowend][i]=num;
                num++;
            }
            
            rowend--;
            
            for (int i=rowend;i>=rowbegin;i--){
                res[i][colbegin]=num;
                num++;
            }
            
            colbegin++;
        }
        
        return res;
    }
}
