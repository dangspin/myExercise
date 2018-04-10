class Solution {
    
    // Sort the array
    
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
        
//         return nums[nums.length/2];
//     }
    
    
    // Divided and Conquer
    
    public int majorityElement(int[] nums) {
        return majorityFind(nums, 0, nums.length-1);
    }
    
    public int majorityFind(int[] nums, int st, int end) {
        if (st == end) {
            return nums[st];
        }
        
        int mid = st + (end-st)/2;
        
        int left = majorityFind(nums, st, mid);
        int right = majorityFind(nums, mid + 1, end);
        
        if (left == right) {
            return left;
        }
        
        int countLeft = count(nums, left, st, end);
        int countRight = count(nums, right, st, end);
        
        return (countLeft > countRight)?left:right; 
    }
    
    public int count(int[] nums, int target, int st, int end) {
        int count = 0;
        
        for (int i = st; i <= end; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        
        return count;
    }
}
