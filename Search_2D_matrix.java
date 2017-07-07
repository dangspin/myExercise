public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0 || matrix[0].length==0){
            return false;
        }
        
        int row=matrix.length;
        int col=matrix[0].length;
        
        int row_up=0;
        int row_do=row-1;
        
        while (row_up<=row_do){
            int row_mid=row_up+(-row_up+row_do)/2;
            
            if (matrix[row_mid][0]==target){
                return true;
            }
            
            if (matrix[row_mid][0]<target){
                row_up=row_mid+1;
            }
            else{
                row_do=row_mid-1;
            }
        }
        if (row_do<0){
        // This line is very important, where, when there is no appropriate
        // it will reture false.
            return false;
        }
        int col_left=0;
        int col_right=col-1;
        
        while (col_left<=col_right){
            int col_mid=col_left+(col_right-col_left)/2;
            
            if (matrix[row_do][col_mid]==target){
                return true;
            }
            else if (matrix[row_do][col_mid]<target){
                col_left=col_mid+1;
            }else{
                col_right=col_mid-1;
            }
        }
        
        return false;
    }
    
}
