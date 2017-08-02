/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<Double>();
        List<Integer> count=new ArrayList<Integer>();
        
        dfs(root,res,count,0);
        
        for (int i=0;i<res.size();i++){
            res.set(i,res.get(i)/count.get(i));
        }
        
        return res;
    }
    
    public void dfs(TreeNode root, List<Double> res, List<Integer> count, int h){
        if (root==null){return ;}
        
        if (h<res.size()){
            res.set(h,res.get(h)+(double)root.val);
            count.set(h,count.get(h)+1);
        }else{
            res.add((double)root.val);
            count.add(1);
        }
        
        dfs(root.left,res,count,h+1);
        dfs(root.right,res,count,h+1);
    }
}
