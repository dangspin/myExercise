class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int res=0;
        for (int i=k;i<=n;i++){
            res=res+number(i,k);
        }
        
        return res;
    }
    
    public int number(int i, int k){
        if (i == 0 && k == 0){
            return 1;
        }
        int count=0;
        
        while (i>0){
            if (i%10==k){
               count++; 
            }
            
            i=i/10;
        }
        
        return count;
    }
    
};
