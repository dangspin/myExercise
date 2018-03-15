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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */


public class BSTIterator {
    /*
    * @param root: The root of binary tree.
    */
    private Stack<TreeNode> st = new Stack<TreeNode> ();
    
    public BSTIterator(TreeNode root) {
        // do intialization if necessary
        while (root!= null) {
            st.push(root);
            root = root.left;
        }
    }

    /*
     * @return: True if there has next node, or false
     */
    public boolean hasNext() {
        // write your code here
        return !st.isEmpty();
    }

    /*
     * @return: return next node
     */
    public TreeNode next() {
        // write your code here
        TreeNode cur = st.pop();
        TreeNode node = cur; 
        
        if (cur.right != null) {
            cur = cur.right;
            while (cur != null) {
                st.push(cur);
                cur = cur.left;
            }
        }
        
        return node;
    }
}
