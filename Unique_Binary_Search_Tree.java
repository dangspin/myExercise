public class Solution {
    // This is a very typical DP solution
    public int numTrees(int n) {
        int [] dp=new int [n+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for (int i=2;i<=n;i++){
            dp[i]=0;
            for (int j=0;j<i;j++){
                dp[i]=dp[i]+dp[j]*dp[i-j-1];
            }
        }
        
        return dp[n];
    }
    
    // This is the recursive way of thinking. The intersting point is the same state transfer equation!
    public static int numOfTree(int n){
         if (n<=1){return 1;}
         
         int res=0;
         for (int i=1;i<=n;i++){
             res=res+numOfTree(n-i)*numOfTree(i-1);
         }
         
         return res;
     }
}
