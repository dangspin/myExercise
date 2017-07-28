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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if (root==null){return res;}
        collect(root,res,0);
        return res;
    }
    
    public void collect(TreeNode root,ArrayList<Integer> result, int h){
        if (root==null){return ;}
        
        if (result.size()<=h){
            result.add(root.val);
        }
        
        if (root.right!=null){
            collect(root.right,result,h+1);
        }
        if (root.left!=null){
            collect(root.left,result,h+1);
        }
    }
}
