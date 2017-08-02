/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if (root==null){
            return res;
        }
        
        List<TreeNode> stack=new ArrayList<TreeNode>();
        
        stack.add(root);
        
        while (stack.size()!=0){
            TreeNode node=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            res.add(node.val);
            
            if (node.right!=null){
                stack.add(node.right);
            }
            
            if (node.left!=null){
                stack.add(node.left);
            }
        }
        
        return res;
    }
}
