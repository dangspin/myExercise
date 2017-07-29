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
    
    public HashMap<Integer,Integer> map;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder==null || postorder==null || inorder.length!=postorder.length){
            return null;
        }
        
        map=new HashMap<Integer,Integer>();
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    
    public TreeNode build(int[] inorder, int[] postorder,int is, int ie, int ps, int pe){
        if (ps>pe){
            return null;
        }
        
        TreeNode root=new TreeNode(postorder[pe]);
        int indx=map.get(postorder[pe]);
        
        root.left=build(inorder,postorder,is,indx-1,ps,ps+indx-is-1);
        root.right=build(inorder,postorder,indx+1,ie,ps+indx-is,pe-1);
        
        return root;
    }
}
