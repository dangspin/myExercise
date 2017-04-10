// Solution1: DFS of the tree and build the path recursively.

public class Solution {
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        List<String> tree=new ArrayList<String>();
        
        if (root==null){return tree;}
        else{
            String s="";
            path(root,tree,s);
            return tree;
        }
    }
    
    public void path(TreeNode root, List<String>tree,String str){
        if (root.left==null && root.right==null){
            str=str+String.valueOf(root.val);
            tree.add(str);
            return;
        }else{
            str=str+String.valueOf(root.val)+"->";
            // This step, we divided the tree into left and right, this is the DFS method
            if (root.left!=null){
                path(root.left,tree,str);
            }
            
            if (root.right!=null){
                path(root.right,tree,str);
            }
        }
    }
}
