class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<> ();
        
        Arrays.sort(nums);
        
        find(res, new ArrayList<Integer>(), nums, 0);
        
        return res;
    }
    
    public void find(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, int st) {
        res.add(new ArrayList<Integer> (tmp));
        
        for (int i = st; i < nums.length; i++) {
            if(i>st && nums[i]==nums[i-1]) continue;
            tmp.add(nums[i]);
            find(res, tmp, nums, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
