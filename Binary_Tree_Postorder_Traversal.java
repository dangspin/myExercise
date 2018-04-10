/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // Iterative
        List<Integer> res = new ArrayList<Integer> ();
        
        if (root == null) {return res;}
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        st.push(root);
        
        while (!st.isEmpty()) {
            TreeNode cur = st.pop();
            res.add(0, cur.val);
            
            if (cur.left != null) {
                st.push(cur.left);
            }
            if (cur.right != null) {
                st.push(cur.right);
            }
        }
        
        return res;
    }
}
