class Solution {
    
    // Regular way of thinking:
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> res = new ArrayList<Integer> ();
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                res.add(nums[i]);
            }
        }
        
        return res;
    }
    
    // A smarter way of thinking:
    // For any array problem, there are always two ways of thinking:
    // For each elements, we can treat them as either a number or an index.
    // For this problem, we can treat them as an index and use it to flip the elements num[index]
    public List<Integer> findDuplicates(int[] nums) {
       
        List<Integer> res = new ArrayList<Integer> ();
        
        for (int i = 0 ; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] < 0) {
                res.add(index+1);
            } else {
                nums[index] = - nums[index];
            }
        }
        
        return res;
        
    }
}
