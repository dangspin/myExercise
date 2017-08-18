/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        
        if (root==null){return res;}
        
        findPath(root,res,new ArrayList<Integer>(), sum);
        
        return res;
    }
    
    public void findPath(TreeNode root, ArrayList<List<Integer>> res, ArrayList<Integer> tmp, int sum){
        
        if (root.left==null && root.right==null){
            if (sum==root.val){
                tmp.add(root.val);
                res.add(new ArrayList<Integer>(tmp));
                tmp.remove(tmp.size()-1);  // This line makes sure that we still need to move to the right branch. 
                                           // because in java tmp is pass by reference.
            }
            return ;
        }
        
        tmp.add(root.val);
        
        if (root.left!=null){
            findPath(root.left,res,tmp,sum-root.val);
        }
        
        if (root.right!=null){
            findPath(root.right,res,tmp,sum-root.val);
        }
        tmp.remove(tmp.size()-1);   // This line makes sure that we finished the this level of node. let's move back upwrad.
    }
}
