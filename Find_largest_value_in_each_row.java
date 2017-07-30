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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        if (root==null){return res;}
        
        ArrayList<TreeNode> queue=new ArrayList<TreeNode>();
        queue.add(root);
        
        while (queue.size()!=0){
            int num=queue.size();
            
            int max=Integer.MIN_VALUE;
            
            for (int i=0;i<num;i++){
                TreeNode tmp=queue.get(0);
                queue.remove(0);
                if (tmp.val>max){
                    max=tmp.val;
                }
                if (tmp.left!=null){
                    queue.add(tmp.left);
                }
                if (tmp.right!=null){
                    queue.add(tmp.right);
                }
            }
            
            res.add(max);
        }
        
        return res;
    }
}
