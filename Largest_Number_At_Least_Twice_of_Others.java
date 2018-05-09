class Solution {
    public int dominantIndex(int[] nums) {
        
        int idx = returnMax(nums);
        int max = nums[idx];
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if ((i != idx) && (max >= 2*nums[i] )) {
                count++;
            }
        }
        
        if (count == nums.length-1) {
            return idx;
        } else {
            return -1;
        }
        
    }
    
    public int returnMax(int[] nums) {
        int max = -1;
        int Idx = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                Idx = i;
            }
        }
        
        return Idx;
    }
}
