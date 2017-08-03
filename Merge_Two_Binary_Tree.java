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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2!=null){
            return t2;
        }
        
        if (t2==null && t1!=null){
            return t1;
        }
        if (t1==null && t2==null){
            return null;
        }
        
        TreeNode root=new TreeNode(t1.val+t2.val);
        root.left=mergeTrees(t1.left,t2.left);
        root.right=mergeTrees(t1.right,t2.right);
        
        return root;
    }
}