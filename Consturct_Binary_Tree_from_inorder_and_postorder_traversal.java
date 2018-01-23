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
    
    
    // 2. Another approach: without extra space, but needs a help function and extra time.
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
        if (inorder.length != postorder.length) {return null;}
        
        return myBuildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    
    public int findPosition(int[] inorder, int instart, int inend, int key) {
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == key) {
                return i;
            }
        }
        
        return -1;
    }
    
    public TreeNode myBuildTree(int[] inorder, int instart, int inend, int[] postorder, int postart, int posend) {
        if (instart > inend) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[posend]);
        
        int position = findPosition(inorder, instart, inend, postorder[posend]);
        
        root.left = myBuildTree(inorder, instart, position-1, postorder, postart, postart + position- instart -1);
        root.right = myBuildTree(inorder, position+1, inend, postorder, postart + position- instart, posend -1);
        
        return root;
    }
}
