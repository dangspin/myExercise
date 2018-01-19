public class Solution {
    /*
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T1 == null || T2 == null) {
            return T2 == null;
        }
        
        if (T1.val == T2.val) {
            return compare(T1, T2) || isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
        } else {
            return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
        }
    }
    
    public boolean compare(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) {
            return true;
        } else if (T1 == null || T2 == null) {
            return false;
        }
        if (T1.val != T2.val) {
            return false;
        }
            
        return compare(T1.left, T2.left) && compare(T1.right, T2.right);
    }
}
