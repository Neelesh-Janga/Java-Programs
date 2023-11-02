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

        if(head == null) return null;

        ListNode tail = null;
        ListNode current = head;
        ListNode lead = current.next;

        if(current.val == val){
            do{
                current.next = tail;
                current = lead;
                if(lead != null)
                    lead = lead.next;
                head = current;
            } while(current != null && current.val == val);
        }

        while(current != null){
            if(current.val == val){
                current.next = null;
                tail.next = lead;
            }else{
                tail = current;
            }
            current = lead;
            if(lead != null)
                lead = lead.next;
        }

        return head;
    }
}