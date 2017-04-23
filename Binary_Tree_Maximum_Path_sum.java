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
     * @return: An integer.
     * 
     *
     */
     
    // This is a very interesting problem. The trick is if left+root+right is max, then it cannot connect to the upper node.
    // So it is really necessary to keep a pathsum, which is a path that might be or not be a maximum path.
     
    int max = Integer.MIN_VALUE;
     
    public int maxPathSum(TreeNode root) {
        // write your code here
        getRes(root);
        return max;
    }
    
    public int getRes(TreeNode root){
        if (root==null){return 0;}
        
        int leftPath=getRes(root.left);
        int rightPath=getRes(root.right);
        
        int pathsum=Math.max(root.val,Math.max(leftPath+root.val,rightPath+root.val));
        max=Math.max(max,Math.max(pathsum,leftPath+root.val+rightPath));
        
        return pathsum;
    }
    
    
}
