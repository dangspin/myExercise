public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        
         
         return help(nums,0,nums.length-1)>=0;
    }
    
     
     public static int help(int[] array,int s, int e){

         if (s>e){
             return 0;
         }
         
         if (s==e){
             return array[s];
         }


         return Math.max(array[s]-help(array,s+1,e),array[e]-help(array,s,e-1));
     }


     private static int sum(int[] array){
         int res=0;
         for (int i:array){
             res=res+i;
         }

         return res;
     }
}
