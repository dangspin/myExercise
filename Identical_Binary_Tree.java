public class Solution {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if (a==null && b==null){return true;}
        else if (a==null && b!=null){return false;}
        else if (a!=null && b==null){return false;}
        else{
            if (a.val!=b.val){
                return false;
            }else{
                return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
            }
        }
    }
}

// This problem is very straightforward, but the only thing need to be consider is the initial condition
// These three condition could save more space and time. There is no need to go through all the tree.
