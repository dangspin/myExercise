import java.util.ArrayList;

public class Solution {
    /*
     * @param nums: An integer array
     * @return: nothing
     */
    
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code here
        // ArrayList<Integer> test = new ArrayList<Integer> (nums);
        
        for (int i = 1; i < nums.size(); i++) {
            if ((nums.get(i) - nums.get(i-1)) < 0) {
                reverse(nums, 0, i-1);
                reverse(nums, i, nums.size()-1);
                reverse(nums, 0, nums.size()-1);
                return;
            }
        }
        
    }
    
    public static void reverse(ArrayList<Integer> nums, int start, int end) {
		if (start > end) {
			return;
		}
		int tmp = nums.get(start);
		nums.set(start, nums.get(end));
		nums.set(end, tmp);
		
		reverse(nums, start+1, end-1);
	}
}
