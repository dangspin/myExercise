public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        int n=nums.length;
        if (n==0){return 0;}
        else{
            int[] res=new int[n];
            
            Arrays.fill(res,1);
            
            for (int i=1;i<n;i++){
                for (int j=0;j<i;j++){
                    if (nums[j]<nums[i] && res[i]<res[j]+1){
                        res[i]=res[j]+1;
                    }
                }
            }
            
            int max=0;
            for (int i=0;i<n;i++){
                if (res[i]>max){
                    max=res[i];
                }
            }
            
            return max;
        }
    }
}
