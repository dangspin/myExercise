public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
        int start = 0;
        int end = nums.length-1;
        
        while (start <= end) {
            if (nums[start] %2 ==1) {
                start++;
            } else if (nums[end] %2 ==0) {
                end--;
            } else {
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start++;
                end--;
            }
        }
    }
}
