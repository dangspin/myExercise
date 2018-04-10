/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        
        if (root == null) {return res;}
        
        int len = 0;
        ListNode cur = root;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        
        int size = len/k;
        int rd = len % k;
        
        ListNode prev = null;
        
        for (int i = 0; i < k; i++) {
            res[i] = root;
            
            for (int j = 0; j < size + (rd > 0?1:0); j++) {
                prev = root;
                root = root.next;
            }
            prev.next = null;
            rd--;
        }
        
        return res;
    }
}
