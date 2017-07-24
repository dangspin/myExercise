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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        
        if (root==null){return res;}
        
        ArrayList<TreeNode> queue=new ArrayList<TreeNode>();
        queue.add(root);
        
        while (queue.size()!=0){
            int n=queue.size();
            
            ArrayList<Integer> level=new ArrayList<Integer>();
            
            for (int i=0;i<n;i++){
                TreeNode node=queue.get(0);
                queue.remove(0);
                
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
                
                level.add(node.val);
            }
            
            res.add(level);
        }
        
        return res;
    }
}
