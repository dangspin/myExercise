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
    public String tree2str(TreeNode t) {
        if (t==null){
            return "";
        }
        
        else if (t.left==null && t.right==null){
            return Integer.toString(t.val);
        }
        else if (t.left!=null && t.right==null){
            return Integer.toString(t.val)+"("+tree2str(t.left)+")";
        }else{
            return Integer.toString(t.val)+"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
        }
    }
}
