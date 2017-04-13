public class Solution {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        // This is the preorder trasverse of the tree. Using binary search
        return convert(A,0,A.length-1);
    }  
    
    public TreeNode convert(int[] A, int start, int end){
        if (start>end){return null;}
        else{
            int mid=start+(end-start)/2;
            TreeNode node=new TreeNode(A[mid]);
            
            node.left=convert(A,start,mid-1);
            node.right=convert(A,mid+1,end);
            
            return node;
        }
    }
}
