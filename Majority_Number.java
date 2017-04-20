public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        Collections.sort(nums);
        
        return nums.get(nums.size()/2);
    }
}
