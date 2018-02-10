public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        ArrayList<Integer> tmp = new ArrayList<Integer> (nums);
        
        if (tmp.size() == 1) {return tmp.get(0);}
        
        int[] dp = new int[tmp.size()];
        
        dp[0]= tmp.get(0);
        
        
        for (int i = 1; i < tmp.size(); i++) {
             dp[i] = Math.min(tmp.get(i), dp[i-1] + tmp.get(i));
        }
        
        Arrays.sort(dp);
        
        return dp[0];
    }
}
