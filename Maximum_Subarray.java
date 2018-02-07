public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
     
     // This is a very typical DP problem, the only thing that needs to point out is that the DP array is not really necessary.
    public int maxSubArray(int[] nums) {
        // write your code here
        int result = Integer.MIN_VALUE;
        int current = 0;
        
        for (int i = 0; i < nums.length; i++) {
            current = Math.max(current + nums[i], nums[i]);
            result = Math.max(current, result);
        }
        
        return result;
    }
    
    public int maxSubArray(int[] nums) {
        
        // This is the DP version solution
        int[] dp = new int[nums.length];
		
		dp[0] = nums[0];
		for (int i = 1; i<nums.length; i++) {
			dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
		}
		
		Arrays.sort(dp);
		return dp[nums.length-1];
    }
}
