class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {return nums.length;}
        
        int st = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                st = i;
            } 
            max = Math.max(max, i - st+1);
        }
        
        return max;
    }
}
