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
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
     
     // This is a very typical DFS problem
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null) {return result;}
        
        findPath(root, target, result, new ArrayList<Integer>());
        
        return result;
    }
    
    public void findPath(TreeNode root, int target, ArrayList<List<Integer>> result, ArrayList<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (target-root.val == 0) {
                result.add(new ArrayList<Integer>(path));
                return ;
            }
            return ;
        }
        
        if (root.left != null) {
            // path.add(root.val);
            findPath(root.left, target-root.val, result, path);
            path.remove(path.size()-1);
            
        }
        
        if (root.right != null) {
            // path.add(root.val);
            findPath(root.right, target-root.val, result, path);
            path.remove(path.size()-1);
            
        }
        
    }
}
