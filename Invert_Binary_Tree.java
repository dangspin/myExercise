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
    /*
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
     
    // Recursive version
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if (root == null) {return ;}
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
    
    // Iterative Version
    public void invertBinaryTree(TreeNode root) {
        if (root == null) {return;}
        
        Stack<TreeNode> st = new Stack<TreeNode> ();
        st.push(root);
        
        while (!st.empty()) {
            TreeNode cur = st.pop();
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
            
            if (cur.left != null) {
                st.push(cur.left);
            }
            if (cur.right != null) {
                st.push(cur.right);
            }
        }
    }
}
