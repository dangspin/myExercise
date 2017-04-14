public class Solution {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        if (A.length()==0 || B.length()==0){return 0;}
        else{
            int n=A.length();
            int m=B.length();
            
            int[][] res=new int[n+1][m+1];
            
            for (int i=1;i<n+1;i++){
                for (int j=1;j<m+1;j++){
                    int mid=Math.max(res[i][j-1],res[i-1][j]);
                    if (A.charAt(i-1)==B.charAt(j-1)){
                        mid=Math.max(mid,res[i-1][j-1]+1);
                    }
                    
                    res[i][j]=mid;
                }
            }
            
            return res[n][m];
            
        }
    }
}

// This is a very typical DP problem, an resonable example could show the correct way of solution.
