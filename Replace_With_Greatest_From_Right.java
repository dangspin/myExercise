public class Solution {
    /*
     * @param : An array of integers.
     * @return: nothing
     */
    public void arrayReplaceWithGreatestFromRight(int[] nums) {
        // Write your code here.
        int max = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            int old = nums[i];
            nums[i] = max;
            max = Math.max(old,max);
        }
        nums[nums.length - 1] = -1;
        
    }
    
    // public int findMax(int[] nums, int start, int end) {
    //     if (start > end) {
    //         return -1;
    //     }
        
    //     int max = Integer.MIN_VALUE;
        
    //     for (int i = start; i <= end; i++) {
    //         if (nums[i] >= max) {
    //             max = nums[i]; 
    //         }
    //     }
        
    //     return max;
    // }
}
