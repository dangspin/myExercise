public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        if (nums.length==1){return nums[0];}
        
        int start=0;
        int end=nums.length-1;
        
        while (start+1<end){
            int mid=start+(end-start)/2;
            
            if (nums[start]<nums[mid] && nums[mid]<nums[end]){
                return nums[start];
            }
            else if (nums[start]>nums[mid] ){
                end=mid;
            }else if (nums[mid]>nums[end]){
                start=mid;
            }
        }
        // This is very very important, it is possible that the start and the minimum next to each other,when the start is bigger then the minimum
        if (nums[start]<nums[nums.length-1]){
            return nums[start];
        }else{
            return nums[end];
        }
        
    }
}
