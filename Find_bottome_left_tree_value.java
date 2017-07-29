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
    public int resheight;
    
    public int findBottomLeftValue(TreeNode root) {
        res=0;
        resheight=0;
        findhelp(root,1);
        return res;
    }
    
    public void findhelp(TreeNode root, int h){
        if (root==null){return ;}
        if (root.left==null && root.right==null && h>resheight){
            res=root.val;
            resheight=h;
            return ;
        }
        
        findhelp(root.left,h+1);
        findhelp(root.right,h+1);
        
        
    }
}
