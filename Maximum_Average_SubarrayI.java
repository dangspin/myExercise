public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int firstsum=0;
        for (int i=0;i<k;i++){
            firstsum=firstsum+nums[i];
        }
        
        int maxi=firstsum;
        
        for (int i=0, j=k;j<nums.length;i++,j++){
            firstsum=firstsum-nums[i]+nums[j];
            maxi=Math.max(firstsum,maxi);
        }
        
        return (double)maxi/((double)k);
    }
}
