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
    /*
     * @param root: The root of segment tree.
     * @param start: start value.
     * @param end: end value.
     * @return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if (root.start == start && root.end == end) {
            return root.max;
        }
        
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        
        int rootmid = root.start + (root.end - root.start)/2;
        
        if (start <= rootmid) {
            if (rootmid < end) {
                leftmax = query(root.left, start, rootmid);
            } else {
                leftmax = query(root.left, start, end);
            }
        } 
        
        if (rootmid < end) {
            if (start <= rootmid) {
                rightmax = query(root.right, rootmid+1, end);
            }else {
                rightmax = query(root.right, start, end);
            }
        }
        
        return Math.max(rightmax, leftmax);
    }
}
