class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        //Binary search but be careful of the last judgement
        if (nums.length==0){return -1;}
        else{
            int posi=-1;
            
            int start=0;
            int end=nums.length-1;
            
            while (start<end){
                int mid=start+(end-start)/2;
                if (nums[mid]==target){
                    posi=mid;
                    end=mid;
                }
                else if (nums[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            if (nums[start]==target){
                return start;
            }
            
            return -1;
        }
    }
}
