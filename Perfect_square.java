package Test;

import java.util.*;

public class Perfect_square {
	public static int numSquares(int n) {
        // write your code here
		
		if (n <= 1) {return 1;}
        
        int[] dp = new int[n+1];
        
        for(int i = 0; i * i <= n; ++i)
            dp[i * i] = 1;

        for (int i = 2; i <= n; i++) {
            int j = 1;
            int min = Integer.MAX_VALUE;
            while (j <= n && j*j <= i) {
            		if ((i - j*j) == 0) {
            			min = Math.min(min, dp[i - j*j]);
            		} else {
            			min = Math.min(min, dp[i - j*j]+1);
            		}
                j++;
            }
            
            dp[i] = min;
        }
        
        return dp[n];
    }
	
	public static void main(String[] args) {
		System.out.println(numSquares(13));
	}
}
