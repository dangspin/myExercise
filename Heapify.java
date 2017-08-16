public class Solution {
    /**
     * @param A: Given an integer array
     * @return: void
     */
    public void heapify(int[] A) {
        // write your code here
        if (A.length==0){return;}
        for (int i=A.length/2;i>=0;i--){
            siftdown(A,i);
        }
    }
    
    public int parent(int i){
        return (int)((i-1)/2);
    }
    
    public int leftChild(int i){
        return 2*i+1;
    }
    
    public int rightChild(int i){
        return 2*i+2;
    }
    
    public void siftdown(int [] A, int i){
        int minindex=i;
        int l=leftChild(i);
        int r=rightChild(i);
        
        if (l<A.length && A[l]<A[minindex]){
            minindex=l;
        }
        if (r<A.length && A[r]<A[minindex]){
            minindex=r;
        }
        if (minindex!=i){
            swap(A,i,minindex);
            siftdown(A,minindex);
        }
    }
    
    public void swap(int[] A, int i, int j){
        int tmp=A[i];
        A[i]=A[j];
        A[j]=tmp;
    }
}
