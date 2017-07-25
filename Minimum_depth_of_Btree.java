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
    public int minDepth(TreeNode root) {
        if (root==null){return 0;}
        else{
            int left=minDepth(root.left);
            int right=minDepth(root.right);
            if (root.left==null || root.right==null){
                return 1+left+right;
            }
            return 1+Math.min(left,right);
        }
    }
}
