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
    
    // Iterative version
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
    
    // DFS version
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<List<Integer>> tree = new ArrayList<List<Integer>> ();
        
        if (root == null) {return tree;}
        
        help(root, tree, 0);
        
        return tree;
    }
    
    public void help(TreeNode root, List<List<Integer>> tree, int layer) {
        if (root == null) {
            return ;
        }
        
        if (tree.size() <= layer) {
            tree.add(new ArrayList<Integer>());
        }
        
        tree.get(layer).add(root.val);
        help(root.left, tree, layer+1);
        help(root.right, tree, layer+1);
    }
}
