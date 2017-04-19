public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here 
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        
        if (numbers.length==0|| numbers.length < 3){return res;}
        
        Arrays.sort(numbers);
        
        for (int i=0;i<numbers.length-2;i++){
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue; // This line is very important, in order to avoid duplicate set of numbers
            }
            
            
            int target=-numbers[i];
            
            int left=i+1;
            int right=numbers.length-1;
            
            while (left<right){
                if (numbers[left]+numbers[right]==target){
                    ArrayList<Integer> subres=new ArrayList<Integer>();
                    subres.add(numbers[i]);
                    subres.add(numbers[left]);
                    subres.add(numbers[right]);
                    res.add(subres);
                    left++;
                    right--;
                    while (left < right && numbers[left] == numbers[left - 1]) {
                            left++;// This line is very important, in order to avoid duplicate set of numbers
                    }
                    while (left < right && numbers[right] == numbers[right + 1]) {
                            right--;// This line is very important, in order to avoid duplicate set of numbers
                    }
                    
                }
                
                else if (numbers[left]+numbers[right]<target){
                    left++;
                }else{
                    right--;
                }
                
            }
                
        }
        
        return res;
        
    }
}

// This problem has the same idea as 2SUM, but the implement requires lots of patience. It is easy to make mistake.
// The basic idea is binary search after sorting the array
