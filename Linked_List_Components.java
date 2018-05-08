/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        if (head == null || G.length == 0) {return 0;}
        HashSet<Integer> set = new HashSet<Integer> ();
        
        ListNode current = head;
        int res = 0;
        
        for (int num:G) {
            set.add(num);
        }
        
        while (current != null) {
            if (set.contains(current.val) && ((current.next == null) || (!set.contains(current.next.val)))) {
                res++;
            }
            
            current = current.next;
        }
        
        return res;
    }
}
