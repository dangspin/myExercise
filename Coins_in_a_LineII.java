public class Solution {
    /**
     * @param values: an array of integers
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int[] values) {
        // write your code here
        if (values==null){return true;}
        int n=values.length;
        
        int sum=sum(values);
        int tar= (sum%2==0? sum/2:sum/2+1 );
        
        return total(values,0)>=tar;
    }
    
    public int total(int[] values,int start){
        if (start>=values.length) {
            return 0;
        }
        
        if (start==values.length-1){
            return values[start];
        }
        
        int first=values[start]+Math.min(total(values,start+2),total(values,start+3));
        int second=values[start]+values[start+1]+Math.min(total(values,start+2),total(values,start+3));
        
        return Math.max(first,second);
    }
    
    public int sum(int[] values){
        int res=0;
        for (int i=0;i<values.length;i++){
            res=res+values[i];
        }
        return res;
    }
}
