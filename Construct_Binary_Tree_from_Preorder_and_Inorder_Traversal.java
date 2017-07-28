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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null || inorder==null || preorder.length!=inorder.length){
            return null;
        }
        
        map=new HashMap<Integer,Integer>();
        
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return build(preorder, inorder, 0, preorder.length-1,0, preorder.length-1);
    }
    
    public TreeNode build(int[] preorder, int[] inorder,int ps, int pe, int is, int ie){
        if (ps>pe){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[ps]);
        
        int index=map.get(preorder[ps]);
        
        root.left=build(preorder,inorder,ps+1,ps+index-is,is,index-1);
        root.right=build(preorder, inorder, ps+index-is+1, pe, index+1,ie);
        
        return root;
    }
    

}
