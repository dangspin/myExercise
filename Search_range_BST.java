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
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
     
     
    //Since the problem requires a ascending order result, it reminds us a inorder traversal the BST
     
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        if (root==null){return res;}
        
        find(root,k1,k2,res);
        return res;
    }
    
    public void find(TreeNode root,int k1,int k2,ArrayList<Integer> result){
        if (root==null){return;}
        find(root.left,k1,k2,result);
        if (root.val>=k1 && root.val<=k2){
            result.add(root.val);
        }
        find(root.right,k1,k2,result);
    }
    
    // Iterative traversal of Binary search tree. Inorder use of stack
    
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        if (root == null) {return result;}
        
        ArrayList<TreeNode> stack = new ArrayList<TreeNode>();
 
        //define a pointer to track nodes
        TreeNode current = root;
 
        while(!stack.isEmpty() || current != null){
 
            // if it is not null, push to stack
            //and go down the tree to left
            if(current != null){
                stack.add(current);
                current = current.left;
 
            // if no left child
            // pop stack, process the node
            // then let p point to the right
            }else{
                TreeNode tmp = stack.remove(stack.size()-1);
                
                if (tmp.val >= k1 && tmp.val <= k2) {
                    result.add(tmp.val);
                }
                
                current = tmp.right;
            }
        }
 
        return result;
    }
}
