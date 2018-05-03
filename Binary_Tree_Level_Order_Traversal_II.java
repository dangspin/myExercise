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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        
        if (root == null) {return res;}
        
        // ArrayList<Integer> tmp = new ArrayList<Integer>();
        ArrayList<TreeNode> qu = new ArrayList<TreeNode>();
        
        qu.add(root);
        
        while (!qu.isEmpty()) {
            int size = qu.size();
            
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            
            for (int i = 0; i < size; i++) {
                TreeNode cur = qu.get(0);
                qu.remove(0);
                tmp.add(cur.val);
                
                if (cur.left != null) {
                    qu.add(cur.left);
                }
                if (cur.right != null) {
                    qu.add(cur.right);
                }
            }
            res.add(tmp);
        }
        
        Collections.reverse(res);
        
        return res;
    }
}
