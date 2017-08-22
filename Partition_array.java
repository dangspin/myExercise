public class Solution {
    /*
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if (nums.length==0){return 0;}
        
        int i=-1;
        for (int j=0;j<nums.length;j++){
            if (nums[j]>=k){
                continue;
            }else{
                i=i+1;
                swap(nums,i,j);
            }
        }
        
        int ind=i+1;
        if (ind>=nums.length){
            return nums.length;
        }else{
            return ind;
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
