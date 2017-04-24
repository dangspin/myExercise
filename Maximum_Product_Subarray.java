public class Solution {
    /**https://www.lintcode.com/submission/?problem=maximum-product-subarray
     * @param nums: an array of integers
     * @return: an integer
     */
    public int maxProduct(int[] nums) {
        // write your code here
        if (nums.length<2){return nums[0];}
        
        int [] maximum=new int[nums.length];
        int [] minimum=new int[nums.length];
        
        int res=Integer.MIN_VALUE;
        
        //initial the DP array
        maximum[0]=nums[0];
        minimum[0]=nums[0];
        
        for (int i=1;i<nums.length;i++){
            
            maximum[i]=Math.max(nums[i],Math.max(maximum[i-1]*nums[i],minimum[i-1]*nums[i]));
            minimum[i]=Math.min(nums[i],Math.min(maximum[i-1]*nums[i],minimum[i-1]*nums[i]));
            
            
            res=Math.max(res,Math.max(maximum[i],minimum[i]));
        }
        
        
        return res;
    }
}
