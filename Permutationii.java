class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
     
     //This problem is similar to permutation I, but need a boolean array to store the already visited numbers.
     
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Write your code here
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        
        if (nums.length==0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        
        Arrays.sort(nums);
        boolean [] isVisited=new boolean[nums.length];
        help(nums,res,new ArrayList<Integer>(),isVisited);
        return res;
    }
    
    public void help(int[] nums, ArrayList<List<Integer>> res,ArrayList<Integer>list,boolean[] isVisited){
        
        if (nums.length==list.size()){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for (int i=0;i<nums.length;i++){
            if (isVisited[i]==true || (i>0 && nums[i]==nums[i-1] && isVisited[i-1]==false)){
                continue;
            }
            
            isVisited[i]=true;
            list.add(nums[i]);
            help(nums,res,list,isVisited);
            list.remove(list.size()-1);
            isVisited[i]=false;
        }
        
    }
}


