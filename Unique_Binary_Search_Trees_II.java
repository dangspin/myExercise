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
     * @paramn n: An integer
     * @return: A list of root
     */
    public List<TreeNode> generateTrees(int n) {
        // write your code here
        if (n <= 0) {
            ArrayList<TreeNode> res = new ArrayList<TreeNode> ();
            res.add(null);
            return res;
        }
        return dfs(1, n);
    }
    
    public ArrayList<TreeNode> dfs(int start, int end) {
        ArrayList<TreeNode> tree = new ArrayList<TreeNode> ();
        if (start > end) {
            tree.add(null);
            return tree;
        }
        
        for (int i = start; i <= end; i++) {
            ArrayList<TreeNode> lefttree = dfs(start, i-1);
            ArrayList<TreeNode> righttree = dfs(i+1, end);
            
            for (TreeNode l : lefttree) {
                for (TreeNode r : righttree) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    
                    tree.add(root);
                }
            }
        }
        
        return tree;
    }
}
