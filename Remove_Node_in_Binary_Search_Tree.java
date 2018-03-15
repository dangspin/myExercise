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
     * @param root: The root of the binary search tree.
     * @param value: Remove the node with given value.
     * @return: The root of the binary search tree after removal.
     */
    public TreeNode removeNode(TreeNode root, int value) {
        // write your code here
        if (root == null) {return null;}
        
        if (root.val > value) {
            root.left = removeNode(root.left, value);
        } else if (root.val < value) {
            root.right = removeNode(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.val = findMini(root.right);
                root.right = removeNode(root.right, root.val);
            }
        }
        return root;
    }
    
    private int findMini(TreeNode root) {
        if (root.left == null) {
            return root.val;
        } else {
            return findMini(root.left);
        }
    }
}
