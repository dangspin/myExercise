public class Solution {
    /*
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A.length == 0) {return 0;}
        
        int maxLength = 1;
        
        int length = 1;
        for (int ri = 1; ri < A.length; ri++) {
            if (A[ri] - A[ri-1] >=0) {
                length++;
            } else {
                length = 1;
            }
            maxLength = Math.max(maxLength, length);
        }
        
        length = 1;
        for (int pi = 1; pi < A.length; pi++) {
            if (A[pi] - A[pi-1] <= 0) {
                length++;
            } else {
                length = 1;
            }
            maxLength = Math.max(maxLength, length);
        }
        
        return maxLength;
    }
}
