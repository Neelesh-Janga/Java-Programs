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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;

        while(true){
            if(fast.next == null)
                return head;
            if(fast.next.next == null)
                return head.next;
            fast = fast.next.next;
            head = head.next;
        }
    }
}