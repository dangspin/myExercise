public class Solution {

    // This is a very intersting but important problem.
    // The solution and basic idea is not that hard.
    // The only thing that needs to be more careful is how to deal with duplicated number.
    // The dfs function will give us the result such as 6, 7,7,8,8. Because it go over all the numberes in the array one by one!!
    // However, the subsequence 6, 7, 8 cannot find out by the dfs under the for loop. The way to overcome this is to use a HashSet,
    // For example, when we have 6,7 it will not count 7 again, instead, it will add 8. But then no more 8.
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if (nums==null){return res;}
        
        build(res,new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    public void build(ArrayList<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, int id){
        if (id>nums.length){return;}
        if (tmp.size()>=2){
            res.add(new ArrayList<Integer>(tmp));
        }
        Set<Integer> used = new HashSet<>();
        for (int i=id;i<nums.length;i++){
            if(used.contains(nums[i])) continue;
            if (tmp.size()==0 || tmp.get(tmp.size()-1)<=nums[i]){
                used.add(nums[i]);
                tmp.add(nums[i]);
                build(res,tmp,nums,i+1);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
