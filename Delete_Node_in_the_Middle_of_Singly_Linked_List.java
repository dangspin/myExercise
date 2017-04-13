public class Solution {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        if (node==null || node.next==null){return;}
        else{
            ListNode newnode=node.next;
            node.val=newnode.val;
            node.next=newnode.next;
        }
    }
}
