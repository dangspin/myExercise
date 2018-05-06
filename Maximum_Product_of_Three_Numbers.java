class Solution {
    public int maximumProduct(int[] nums) {
        
        int N = nums.length-1;
        
        Arrays.sort(nums);
        
        return (Math.max(nums[N]*nums[0]*nums[1], nums[N]*nums[N-1]*nums[N-2]));
    }
}
