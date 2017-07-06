public class Solution {
     
    // 1. This is a very strightforward way to use recursive. The only key point
    // is that when the target value is 0, there are two possibilities. That is way I need two conditions.
    public int findTargetSumWays(int[] nums,int S){
        if (nums==null){return 0;}
        
        int end=nums.length-1;
        
        return help(nums,end,S);
    }    
    
    public int help(int[] nums,int end, int S) {
         if (end<0){
             return 0;
         }
         if (end==0){
             if (nums[0]==Math.abs(S) && S!=0){
                 return 1;
             }else if (nums[0]==Math.abs(S) && S==0){
                 return 2;
             }else{
                 return 0;
             }
         }
         
         return help(nums,end-1, S-nums[end])+help(nums,end-1, S+nums[end]);
    }
}
