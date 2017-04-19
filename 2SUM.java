public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        
        HashMap<Integer, Integer> help=new HashMap<Integer,Integer>();
        for (int i=0;i<numbers.length;i++){
            if (help.containsKey(target-numbers[i])==true){
                int[] res={help.get(target-numbers[i]),i+1};
                return res;
            }else{
                help.put(numbers[i],i+1);
            }
        }
        
        int[] res={};
        return res;
    }
}
