public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int[] step = new int[nums.length];
        step[0] = 0;
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] + j >= i){
                    step[i] = step[j] + 1;
                    break;
                }
            }
        }
        return step[nums.length - 1];
    }
}
