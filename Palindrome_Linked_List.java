/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {return true;}
        
        if (head.next == null) {return true;}
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (fast != null) {
            slow = slow.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null) {return null;}
        
        ListNode prev = null;
        ListNode cur = head;
        
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        
        return prev;
    }
}
