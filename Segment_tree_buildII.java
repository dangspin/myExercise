/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param A: a list of integer
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int[] A) {
        // write your code here
        if (A.length==0){return null;}
        SegmentTreeNode root=help(A,0,A.length-1);
        return root;
    }
    
    public SegmentTreeNode help(int[] A,int start,int end){
        if (start>end || A.length==0){return null;}
        if (start==end){
            int max=A[start];
            SegmentTreeNode node=new SegmentTreeNode(start,end,max);
            return node;
        }
        
        int mid=(start+end)/2;
        
        SegmentTreeNode root=new SegmentTreeNode(start,end,0);
        root.left=help(A,start,mid);
        root.right=help(A,mid+1,end);
        root.max=Math.max(root.left.max,root.right.max);
        return root;
    }
}
