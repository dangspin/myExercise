/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 * Definition for Doubly-ListNode.
 * public class DoublyListNode {
 *     int val;
 *     DoublyListNode next, prev;
 *     DoublyListNode(int val) {
 *         this.val = val;
 *         this.next = this.prev = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param root: The root of tree
     * @return: the head of doubly list node
     */
    // Method1: This is a really wordy solution. But the implement is quite straightforward. And the correct implementation need
    // to super familiar with Linked list and tree
    
    public DoublyListNode bstToDoublyList(TreeNode root) {  
        // Write your code here
        if (root==null){return null;}
        DoublyListNode cur=bstDoublyList2(root);
        
        while (cur.prev!=null){
            cur=cur.prev;
        }
        
        return cur;
    }
    
    public DoublyListNode bstDoublyList2(TreeNode root){
        if (root==null){
            return null;
        }
        DoublyListNode left=bstDoublyList2(root.left);
        DoublyListNode right=bstDoublyList2(root.right);
        
        DoublyListNode ld=new DoublyListNode(root.val);
        
        left=rightMost(left);
        right=leftMost(right);
        
        ld.prev=left;
        ld.next=right;
        
        if (left!=null){left.next=ld;}
        if (right!=null){right.prev=ld;}
        
        return ld;
    }
    
    public DoublyListNode rightMost(DoublyListNode root){
        if (root==null){
            return null;
        }
        DoublyListNode rm=root;
        while (rm.next!=null){
            rm=rm.next;
        }
        return rm;
    }
    
    public DoublyListNode leftMost(DoublyListNode root){
        if (root==null){
            return null;
        }
        DoublyListNode rm=root;
        while (rm.prev!=null){
            rm=rm.prev;
        }
        return rm;
    }
    
    
}
