/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){return null;}
        
        ListNode current=head;
        
        while (current!=null){
            if (current.next==null){
                return head;
            }else{
                if (current.val==current.next.val){
                    current.next=current.next.next;
                }else{
                    current=current.next;
                }
            }
        }
        
        return head;
    }
}
