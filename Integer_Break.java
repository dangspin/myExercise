class Solution {
    public int integerBreak(int n) {
        
        // Not a difficult problem, very straightforward thinking, but this is about O(n^2).
        // Just one thing need to be careful that the transition condition includes the comparison between intBreak[k].
        // Because the inner loop updates this value everytime, so we need to check it to make sure it reaches the global maximum.
        
        int[] intBreak = new int[n+1];
        
        intBreak[1] = 1;
        intBreak[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                intBreak[i] = Math.max(intBreak[i], Math.max(j*(i-j), Math.max(intBreak[j]*intBreak[i-j], j*intBreak[i-j])));
            }
        }
        
        return intBreak[n];
    }
}
