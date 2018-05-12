class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
    
    // This is a very interesting problem, could be solved by similar idea to Dynammic programming! But we 
    // need an iterative solution to speed it up.
    
        int res = 0; int count = 0; int st = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= L && A[i] <= R) {
                res = res + i - st + 1;
                count = i - st + 1;
            } else if (A[i] < L) {
                res = res + count;
            } else {
                st = i + 1;
                count = 0;
            }
        }
        
        return res;
    }
}
