 public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        Arrays.sort(candidates);
        
        if (target<=0 || candidates.length==0){return res;}
        build(candidates,target,res,new ArrayList<Integer>(),0);
        return res;
    }
    
    public void build(int[] candidates, int target, List<List<Integer>> res, List<Integer> tmp, int st){
        if (target<0 || st>=candidates.length){
            return;
        }
        else if (target==0){
            res.add(new ArrayList<Integer>(tmp)); //This new ArrayList<Integer>() is critical, otherwise, the object will change all the time.
            return ;
        }else{
            for (int i=st;i<candidates.length && target>=candidates[i];i++){
                tmp.add(candidates[i]);
                build(candidates,target-candidates[i],res,tmp,i);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
