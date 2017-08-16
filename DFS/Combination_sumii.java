public class Solution {
    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(num);
        dfs(num,res,new ArrayList<Integer>(),target,0);
        return res;
    }
    
    public void dfs(int[] num, ArrayList<List<Integer>> res, ArrayList<Integer> tmp, int target, int st){
        if (target<0){return;}
        if (target==0){
            res.add(new ArrayList<Integer>(tmp));
        }
        
        for (int i=st;i<num.length;i++){
            if (i>st && num[i]==num[i-1]){continue;}
            tmp.add(num[i]);
            dfs(num,res,tmp,target-num[i],i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
