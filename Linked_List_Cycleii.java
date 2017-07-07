/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 // This is a very classic problem of using math to solve algorithm problem. Suppos before enter the cycle, there are A element,
 // The fast and slow pointer meet at B after the enter cycle point. Then A+B+Cycle=2*A+2*B -> A=C-B
 
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null || head.next==null){return null;}
        
        ListNode slow=head;
        ListNode fast=head.next;
        
        while (slow!=fast){
            if (fast==null || fast.next==null){
                return null;
            }
            
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode nslow=head;
        
        while (nslow!=fast.next){
            nslow=nslow.next;
            fast=fast.next;
        }
        
        return nslow;
    }
    
    
}
