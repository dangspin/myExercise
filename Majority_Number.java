public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        Collections.sort(nums);
        
        return nums.get(nums.size()/2);
    }
    
    public int majorityNumber(ArrayList<Integer> nums){
        
        int count=0;
        int prev=0;
        
        for (int i=0;i<nums.size();i++){
            if (count==0){
                prev=nums.get(i);
                count++;
            }else{
                if (nums.get(i)!=prev){
                    count--;
                }else{
                    count++;
                }
            }
        }
        
        return prev;
    }
}
