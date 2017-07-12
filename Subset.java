class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
     
     // I really like this problem. It is basically the same as the premutation problem. The only difference is marked as **
     
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        
        if (nums.length==0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        
        Arrays.sort(nums);
        
        int start=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        help(nums,start,res,list);
        return res;
        
    }
    
    public void help(int[] nums,int start,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list){
        result.add(new ArrayList<Integer> (list));  //**
        
        
        for (int i=start;i<nums.length;i++){   // **
            if (!list.contains(nums[i])){
                list.add(nums[i]);
                help(nums,i+1,result,list);
                list.remove(list.size()-1);
            }
        }
    }
}
