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
    
    This is a pure recursive solution. It is quite slow. Need DP to accelerate.
    
    public int rob(TreeNode root) {
        if (root==null){return 0;}
        if (root.left==null && root.right==null){return root.val;}
        if (root.left!=null && root.right==null){
            return Math.max(root.val+rob(root.left.left)+rob(root.left.right),rob(root.left));
        }
        if (root.left==null && root.right!=null){
            return Math.max(root.val+rob(root.right.left)+rob(root.right.right),rob(root.right));
        }
        else if (root.left!=null && root.right!=null){
            return Math.max(root.val+rob(root.left.left)+rob(root.left.right)+rob(root.right.left)+rob(root.right.right),rob(root.left)+rob(root.right));
        }
        return 0;
    }
}
