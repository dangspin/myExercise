public class Solution {
    /**
     * @param A: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
        // write your code here
        // This is a very typical dynamic programming method. The idea is very 
        // straightforward
        if (A.length==0){return 0;}
        if (A.length==1){return A[0];}
        long [] res=new long[A.length+1];
        
        res[0]=0;
        res[1]=A[0];
        
        for (int i=2;i<A.length+1;i++){
            res[i]=Math.max(A[i-1]+res[i-2],res[i-1]);
        }
        
        
        return res[A.length];
    }
    
}
