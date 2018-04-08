/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        
        ListNode cur1 = small;
        ListNode cur2 = big;
        
        while (head != null) {
            if (head.val < x) {
                cur1.next = head;
                head = head.next;
                cur1 = cur1.next;
            } else {
                cur2.next = head;
                head = head.next;
                cur2 = cur2.next;
            }
        }
        
        cur2.next = null;
        cur1.next = big.next;
        
        return small.next;
    }
}
