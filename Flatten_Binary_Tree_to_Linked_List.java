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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        // write your code here
        if (root==null){return ;}
        else{
            ArrayList<TreeNode> stack=new ArrayList<TreeNode>();
            ArrayList<TreeNode> parent=new ArrayList<TreeNode>();
            
            stack.add(root);
            while (stack.size()!=0){
                TreeNode node=stack.remove(stack.size()-1);
                
                if (parent.size()!=0){
                    TreeNode par=parent.remove(parent.size()-1);
                    par.right=node;
                }
                
                if (node.right!=null){
                    stack.add(node.right);
                }
                
                if (node.left!=null){
                    stack.add(node.left);
                }
                
                node.left=null;
                parent.add(node);
            }
            
        }
    }
    
    // This version only need one stack only
    public void flatten(TreeNode root) {
        // write your code here
        if (root == null) {return ;}
        
        ArrayList<TreeNode> stack = new ArrayList<TreeNode>();
        stack.add(root);
        
        while (!stack.isEmpty()) {
            TreeNode current = stack.remove(stack.size()-1);
            
            if (current.right != null) {
                stack.add(current.right);
            }
            
            if (current.left != null) {
                stack.add(current.left);
            }
            
            if (!stack.isEmpty()) {
                current.left = null;
                current.right = stack.get(stack.size()-1);
            } else {
                current.left = null;
                current.right = null;
            }
        }
    }
}


// For this problem, I first implement the preorder trasversal, this could be seen from the problem.
// Then the next point is track the parent node to decide which node is the parent.
