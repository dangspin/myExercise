public class Solution {
    /*
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        // This is a very typical binary search problem
        
        
        if (A.length < 3) {return -1;}
        
        int start = 0;
        int end = A.length -1;
        int peak = -1;
        
        while (start + 1 < end) {
            int mid = start + (end-start)/2;
            
            if ((A[mid-1] <= A[mid]) && (A[mid] >= A[mid+1])) {
                end = mid;
                break;
            } else if (A[mid-1] > A[mid]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (A[start] < A[end]) {
            return end;
        } else {
            return start;
        }
    }
}
