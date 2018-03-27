/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        
        return help(nums, 0, nums.length-1);
    }
    
    public TreeNode help(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int maxInd = returnIndex(nums, start, end);
        
        TreeNode root = new TreeNode(nums[maxInd]);
        root.left = help(nums, start, maxInd-1);
        root.right = help(nums, maxInd+1, end);
        
        return root;
    }
    
    public int returnIndex(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        
        return index;
        
    }
}
