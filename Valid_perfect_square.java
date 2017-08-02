public class Solution {
    public boolean isPerfectSquare(int num) {
        return help((long)num,0, (long)num);
    }
    
    public boolean help(long num, long st, long en){
        if (st==en && st*st==num){ 
            return true;
        }
        if (st==en && st*st!=num){return false;}
        if (st> en){return false;}
        
        long mid=st+(en-st)/2;
        
        if (mid*mid==num){
            return true;
        }
        
        else if (mid*mid<num){
            return help(num,mid+1,en);
        }else{
            return help(num,st,mid-1);
        }
    }
}
