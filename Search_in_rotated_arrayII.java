public class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length==0){return false;}
        
        int st=0;
        int end=nums.length-1;
        
        while (st+1<end){
            int mid=st+(end-st)/2;
            
            if (nums[mid]==target){
                return true;
            }
            
            if (nums[mid]<nums[end] || nums[mid]<nums[st]){
                if (target>nums[mid] && target<=nums[end]){
                    st=mid;
                }else{
                    end=mid;
                }
            }
            
            else if (nums[mid]>nums[end] || nums[mid]>nums[st]){
                if (target<nums[mid] && target>=nums[st]){
                    end=mid;
                }else{
                    st=mid;
                }
            }else{
                end--;
            }
            
            
        }
        
        if (nums[st]==target || nums[end]==target){
            return true;
        }else{
            return false;
        }
    }
}
