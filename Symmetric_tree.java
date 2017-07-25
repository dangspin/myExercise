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
    public boolean isSymmetric(TreeNode root) {
        if (root==null){return true;}
        else{
            return help(root,root);
        }
    }
    
    public boolean help(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        else if (root1.val==root2.val){
            return help(root1.left, root2.right) && help(root1.right,root2.left);
        }else{
            return false;
        }
    }
}
