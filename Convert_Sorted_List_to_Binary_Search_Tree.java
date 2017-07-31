/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null){return null;}
        
        int size=0;
        ListNode newhead=head;
        while (newhead!=null){
            newhead=newhead.next;
            size++;
        }
        
        return convert(head,1,size);
    }
    
    public TreeNode convert(ListNode head, int st, int end){
        if (st>end){return null;}
        int mid=st+(end-st)/2;
        
        int j=st;
        ListNode current=head;
        
        while (j<mid){
            current=current.next;
            j++;
        }
        
        TreeNode root=new TreeNode(current.val);
        root.left=convert(head,st,mid-1);
        root.right=convert(current.next,mid+1,end);
        
        return root;
    }
}
