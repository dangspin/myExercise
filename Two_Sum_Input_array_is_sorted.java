public class Solution {
    /*
     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int start = 0;
        int end = nums.length-1;
        
        int [] res = new int[2];
        
        while (start < end) {
            if ((target - nums[start]) < nums[end]) {
                end = end-1;
            } else if ((target - nums[start]) == nums[end]) {
                res[0] = start+1;
                res[1] = end+1;
                break;
            } else {
                start = start +1;
            }
        }
        
        return res;
    }
}
