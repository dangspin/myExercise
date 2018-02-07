public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        // The idea for solving this problem is very interesting, since we have extra space at the
        // second part of the arrayA, in order to use that space, we have to scan both A and B from the
        // last index. In this way, we don't have desgin difficult method to manipulate that space. Also
        // we don't have to worry about the element that has been scanned already, it can be overlaped by
        // other element.
        
        int lastIndex = m + n - 1;
        
        int alst = m-1;
        int blst = n-1;
        
        while (alst >= 0 && blst >=0) {
            if (A[alst] >= B[blst]) {
                A[lastIndex] = A[alst];
                alst--;
            } else {
                A[lastIndex] = B[blst];
                blst--;
            }
            
            lastIndex--;
        }
        
        while (alst >= 0) {
            A[lastIndex] = A[alst];
            alst--;
            lastIndex--;
        }
        
        while (blst >= 0) {
            A[lastIndex] = B[blst];
            blst--;
            lastIndex--;
        }
    }
}
