// This is a very very typical and easy dynammic programming problem.
// But the result is very intersting, it is Fibonacci numbers

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (n<=1){
            return 1;
        }else{
            int[] stairs=new int[n+1];
            // initial the array
            stairs[0]=1;
            stairs[1]=1;
            
            for (int i=2;i<=n;i++){
            
                // condition equation
                stairs[i]=stairs[i-1]+stairs[i-2];
            }
        
            return stairs[n];
        }
            
    }
}
