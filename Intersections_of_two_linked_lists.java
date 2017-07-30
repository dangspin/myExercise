/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=length(headA);
        int lenB=length(headB);
        
        if (lenA>lenB){
            int j=0;
            while (j<(lenA-lenB)){
                headA=headA.next;
                j++;
            }
        }else if (lenA<lenB){
            int j=0;
            while (j<(lenB-lenA)){
                headB=headB.next;
                j++;
            }
        }
        while (headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        
        return headA;
    }
    
    public int length(ListNode head){
        if (head==null){return 0;}
        
        int len=0;
        
        while (head!=null){
            len++;
            head=head.next;
        }
        
        return len;
    }
}
