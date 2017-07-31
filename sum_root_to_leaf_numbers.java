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
    
    public int res;
    
    public int sumNumbers(TreeNode root) {
        res=0;
        
        if (root==null){return res;}
        
        sum(root,0);
        return res;
    }
    
    public void sum(TreeNode root, int csum){
        if (root==null){return;}
        if (root.left==null && root.right==null){
            res=res+10*csum+root.val;
            return;
        }
        
        csum=10*csum+root.val;
        sum(root.left,csum);
        sum(root.right,csum);
    }
    
}
