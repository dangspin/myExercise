class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
     
     // This is not a difficult problem. Just pay attention to the end recursion conditions. DFS
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        
        // if (nums==null || nums.length==0){return res;}
        
        if (nums.length == 0) {
            res.add(new ArrayList<Integer>());
            return res;
         }

        int start=0;
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        help(nums,start,res,list);
        return res;
    }
    
    public void help(int[] nums,int start, ArrayList<List<Integer>> result,ArrayList<Integer> list){
        if (nums.length==list.size()){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        
        for (int i=0;i<nums.length;i++){
            if (!list.contains(nums[i])){
                list.add(nums[i]);
                help(nums,i+1,result,list);
                list.remove(list.size()-1);
            }
        }
        
    }
}
