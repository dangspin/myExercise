public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        if (numbers == null || numbers.length < 3) {
            return -1;
        }
        
        Arrays.sort(numbers);
        int res=numbers[0]+numbers[1]+numbers[2];
        
        for (int i=0;i<numbers.length;i++){
            int start=i+1;
            int end=numbers.length-1;
            
            while (start<end){
                int current=numbers[i]+numbers[start]+numbers[end];
                
                if (Math.abs(target-current)<Math.abs(target-res)){
                    res=current;
                }
                
                if (current<target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        
        return res;
    }
}
