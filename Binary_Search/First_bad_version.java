/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n<=0){return 0;}
        
        int st=1;
        int end=n;
        
        
        while (end-st>0){
            int mid=st+(end-st)/2;
            
            if (isBadVersion(mid)){
                end=mid;
            }else{
                st=mid+1;
            }
        }
        
        return st;
    }
}
