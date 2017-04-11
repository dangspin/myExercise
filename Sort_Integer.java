public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        // Bubble sort: keep switching and push the maximum forward. Repeat it the length of array times.
        
        int time=A.length;
        
        while (time>0){
            for (int i=0;i<A.length-1;i++){
                if (A[i]>A[i+1]){
                    int tmp=A[i];
                    A[i]=A[i+1];
                    A[i+1]=tmp;
                }
            }
            time=time-1;
        }
    }
    
    public void sortIntegers(int[] A) {
        // Write your code here
        // Selection sort: Find the minimum for the rest of the array, then repeat it the length of array times.
        
        int time=A.length;
        
        for (int i=0;i<time;i++){
            int miniindex=i;
            for (int j=i;j<time;j++){
                if (A[j]<A[miniindex]){
                    miniindex=j;
                }
            }
            
            if (miniindex!=i){
                int temp=A[i];
                A[i]=A[miniindex];
                A[miniindex]=temp;
            }
        }
    }
    
     public void sortIntegers(int[] A) {
        // Write your code here
        // Insertion sort: keep switching and push the smallest to the appropriate position in the array. repeat the length of array times.
        
        int time=A.length;
        
        for (int i=1;i<time;i++){
            int j=i;
            while (j>0 && A[j-1]>A[j]){
                int tmp=A[j];
                A[j]=A[j-1];
                A[j-1]=tmp;
                j=j-1;
            }
        }
    }
}
