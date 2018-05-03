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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        return findTargethelp(root, k, set);
    }
    
    public boolean findTargethelp(TreeNode root, int k, HashSet<Integer> set) {
        if (root == null) {
            return false;
        } 
        if (set.contains(k-root.val)) {
            return true;
        }
        set.add(root.val);
        
        return findTargethelp(root.left, k, set) | findTargethelp(root.right, k, set);
    }
}
