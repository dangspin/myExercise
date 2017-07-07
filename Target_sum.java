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
     
     // 2.The memorization method, optimize the solution
     private static HashMap<String,Integer> map=new HashMap<String,Integer>();
     
     public static int help(int[] nums,int end, int S) {
         if (end<0){
             return 0;
         }
         if (end==0){
             String ss=end+"->"+S;
             int res;
             if (nums[0]==Math.abs(S) && S!=0){
                
                 res=1;
             }else if (nums[0]==Math.abs(S) && S==0){
                 res=2;
             }else{
                 res=0;
             }
             if (!map.containsKey(ss)){
                     map.put(ss,res);
             }
             return map.get(ss);
         }
         
         String s=end+"->"+S;
         
         if (!map.containsKey(s)){
             int target=help(nums,end-1, S-nums[end])+help(nums,end-1, S+nums[end]);
             map.put(s,target);
         }
         
         return map.get(s);
    }
     
}
