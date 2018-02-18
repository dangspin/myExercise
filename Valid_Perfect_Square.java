public class Solution {
    /**
     * @param num: a positive integer
     * @return: if num is a perfect square else False
     */
    // public boolean isPerfectSquare(int num) {  
    //     if(num < 0) return false;  
    //     if(num == 0 || num == 1) return true;  
    //     for(int i=1; i<= num/i; i++){  
    //         if( i*i == num) return true;  
    //     }  
    //     return false;  
    // }
    
   public boolean isPerfectSquare(int num) {
        long start = 1, end = num;
        while (start <= end) {
            long mid = start + (end-start)/2;
            long t = mid * mid;
            if (t == num) return true;
            else if (t < num) start = mid+1;
            else end = mid-1;
        }
        return false;
    }

}
