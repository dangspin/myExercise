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
     * @param root: A Tree
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>> ();
        
        if (root == null) {return result;}
        
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        
        queue.add(root);
        
        int num_level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            ArrayList<Integer> level = new ArrayList<Integer>();
            
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove(0);
                
                if (num_level % 2 ==0) {
                    level.add(current.val);
                }else {
                    level.add(0, current.val);
                }
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            
            num_level++;
            result.add(level);
            
        }
        return result;
    }
}
