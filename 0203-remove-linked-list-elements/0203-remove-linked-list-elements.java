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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;

        // Deals removal operations at head node
        while(current == head && current != null){
            if(current.val == val){
                head = head.next;
                current.next = null;
                current = head;
            }else{
                current = current.next;
            }
        }

        // Deals removal operations of the remaining nodes
        ListNode follow = head;
        while(current != null){
            if(current.val == val){
                follow.next = current.next;
                current.next = null;
                current = follow.next;
            }else{
                follow = current;
                current = current.next;
            }
        }

        return head;
    }
}