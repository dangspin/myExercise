/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root the root of binary tree
     * @return the new root
     */
     
    // This is an easy tree traversal problem. The core idea is we can solve the right branch first, beacause it has the maximum 
    // tree value. Then recursively add the root and then the left child. we need an extra value to keep the maximum value. It is an external
    // variable. 
     
    int max=0; 
     
    public TreeNode convertBST(TreeNode root) {
        // Write your code here
        help(root);
        return root;
    }
    
    public void help(TreeNode root){
        if (root==null){
            return;
        }
        help(root.right);
        root.val=root.val+max;
        max=root.val;
        help(root.left);
    }
}
