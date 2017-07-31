public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length==0){return 0;}
        
        int res=0; 
        
        for (int i=0;i<nums.length;i++){
            int j=i;
            int tmp=0;
            while(j<nums.length && nums[j]==1){
                tmp++;
                j++;
            }
            i=j;
            
            res=Math.max(res,tmp);
        }
        
        return res;
    }
}
