class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        
        int L = nums.length-1;
        
        for (int j = 0; j <= L; j++) {
            if (parSum(nums, 0, j-1) == parSum(nums, j+1, L)) {
                return j;
            }
        }
        
        return -1;
    }
    
    public int parSum(int[] nums, int start, int end) {
        if (start > end) {
            return 0;
        }
        
        int res = 0;
        
        for (int i = start; i <= end; i++) {
            res = res + nums[i];
        }
        
        return res;
    }
}
