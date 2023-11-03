/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode follow = null;
        ListNode current = head;
        ListNode nextNode = head.next;

        while(current != null){
            current.next = follow;

            follow = current;
            current = nextNode;
            if(nextNode != null)
                nextNode = nextNode.next;
        }

        return follow;
    }
}