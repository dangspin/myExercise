class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if (Length(A)==0 || Length(B)==0){return 2.0000;}
        
        double cos=dot(A,B)/(Length(A)*Length(B));
        
        return cos;
    }
    
    public double Length(int[] array){
        double sum=0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i]*array[i];
        }
        
        return Math.sqrt(sum);
    }
    
    public double dot(int[] A, int[] B){
        if (A.length!=B.length){return 0;}
        
        double dot=0;
        for (int i=0;i<A.length;i++){
            dot=dot+A[i]*B[i];
        }
        
        return dot;
    }
}
