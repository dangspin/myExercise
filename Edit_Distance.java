public class Solution {
    /*
     * @param word1: A string
     * @param word2: A string
     * @return: The minimum number of steps.
     */
    public int minDistance(String word1, String word2) {
        // write your code here
        int l1 = word1.length();
        int l2 = word2.length();
        
        int[][] dp = new int[l1+1][l2+1];
        
        for (int i = 0; i < l2+1; i++) {
            dp[0][i] = i;
        }
        
        for (int i = 0; i < l1+1; i++) {
            dp[i][0] = i;
        }
        
        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] =1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                }
            }
        }
        
        return dp[l1][l2];
    }
}
