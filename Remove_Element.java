public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if (A.length == 0) {return 0;}
        
        int l_of_A = A.length-1;
        
        int i = 0;
        int j = l_of_A;
        
        while (i <= j) {
            if (A[j] == elem) {
                j = j-1;
            } else if (A[i] != elem && A[j] != elem) {
                i = i+1;
            } else if (A[i] == elem && A[j] != elem) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
                i++;
                j--;
            }
        }
        
        return j+1;
    }
}
