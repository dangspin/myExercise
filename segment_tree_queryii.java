/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, count;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int count) {
 *         this.start = start;
 *         this.end = end;
 *         this.count = count;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The count number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if (start>end || root==null){
            return 0;
        }
        
        if (start<=root.start && end>=root.end){
            return root.count;
        }
        
        else{
            int mid=(root.start+root.end)/2;
            int left=0;int right=0;
            
            
            if (start<=mid){
                if (mid<end){
                    left=query(root.left,start,mid);
                }else{
                    left=query(root.left,start,end);
                }
            }
            
            if (mid<end){
                if (start<=mid){
                    right=query(root.right,mid+1,end);
                }else{
                    right=query(root.right,start,end);
                }
            }
            
            return left+right;
        }
    }
}
