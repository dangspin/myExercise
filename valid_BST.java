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
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
     
    // This is a very typical problem. But the only thing is that we have to use Long type of Integer. 
    
    public boolean isValidBST(TreeNode root) {
        // write your code here
        if (root==null){return true;}
        return help(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    
    public boolean help(TreeNode root,long min,long max){
        if (root==null){
            return true;
        }
        
        else{
            if (root.val >= max || root.val <= min) {
                return false;
            }else{
                return help(root.left,min,root.val) && help(root.right,root.val,max);
            }
        }
    }
}
