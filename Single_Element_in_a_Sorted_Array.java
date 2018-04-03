class Solution {
    // O(n) solution, XOR solution
    public int singleNonDuplicate(int[] nums) {
        int res = nums[0];
        
        for (int i = 1 ; i < nums.length; i++) {
            res = res^nums[i];
        }
        
        return res;
    }
    
    // O(n) solution, single loop
    public int singleNonDuplicate(int[] nums) {
        
        int i = 1;
        while (i < nums.length) {
            if (nums[i] != nums[i-1]) {
                return nums[i-1];
            }
            
            i = i+2;
        }
        
        return nums[i-1];
    }
    
    //O(logn) solution, binary search
    public int singleNonDuplicate(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        
        while (start < end) {
            int mid = start + (end-start)/2;
            
            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }
            else if (nums[mid] == nums[mid+1] && mid %2 ==0) {
                start = mid + 1;
            } else if (nums[mid] == nums[mid-1] && mid %2 ==1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
         
        }
        return nums[start];
    }
}
