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
    
    //#2. Second version of solution
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if (preorder.length != inorder.length) {return null;}
        return myBuildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    
    public TreeNode myBuildTree(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend) {
        if (instart > inend) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[prestart]);
        int position = findPosition(inorder, instart, inend, preorder[prestart]);
        
        root.left = myBuildTree(preorder, prestart + 1, prestart + position - instart, inorder, instart, position - 1);
        root.right = myBuildTree(preorder, position - inend + preend + 1, preend, inorder, position + 1, inend);
        
        return root;
    }
    
    public int findPosition(int[] inorder, int instart, int inend, int key) {
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == key) {
                return i;
            }
        }
        
        return -1;
    }

}
