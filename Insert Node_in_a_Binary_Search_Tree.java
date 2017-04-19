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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root==null){return node;}
        else{
            boolean find=false;
            TreeNode current=root;
            
            while (!find){
                if (current.val>node.val){
                    if (current.left==null){
                        current.left=node;
                        find=true;
                    }else{
                        current=current.left;
                    }
                }else{
                    if (current.right==null){
                        current.right=node;
                        find=true;
                    }else{
                        current=current.right;
                    } 
                }
                
                
            }
            
            return root;
        }
    }
    
    
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root==null){return node;}
        else{
            if (root.val>node.val){
                root.left=insertNode(root.left,node);
            }else{
                root.right=insertNode(root.right,node);
            }
            
            
            return root;
        }
    }
    
    
}
