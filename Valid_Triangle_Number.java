class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int k = i+2;
            for (int j = i+1; j < nums.length - 1 && nums[i] != 0; j++) {
                k = findIndex(nums, k, nums.length-1, nums[i]+nums[j]);
                count = count + k - j;
            }
        }
        
        return count;
    }
    
    public int findIndex(int[] nums, int st, int end, int target) {
        // int st = stt;
        
        while (st < nums.length && st + 1 < end) {
            int mid = st + ((end - st)/2);
            
            if (nums[mid] >= target) {
                end = mid -1;
            } else {
                st = mid;
            }
        }
        
        if (nums[end] < target) {
            return end;
        } else if (nums[st] < target) {
            return st;
        } else {
            return st-1;
        }
    }
}
