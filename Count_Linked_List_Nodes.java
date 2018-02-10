/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        // Iterative version 
        if (head == null) {
            return 0;
        }
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    
    public int countNodes(ListNode head) {
        // recursive version
        if (head == null) {
           return 0;
        }
        return 1 + countNodes(head.next);
    }
}
