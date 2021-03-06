public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        int left=0;
        int right=nums.length-1;
        
        while (left<right){
            while (nums[left]%2==1){
                left++;
            }
            
            while (nums[right]%2==0) {
                right--;
            }
            
            if (left<right){
                int tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
            }
        }
        
    }
}
