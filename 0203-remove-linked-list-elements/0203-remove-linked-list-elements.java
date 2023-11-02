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

        ListNode res = null;
        ListNode current = null;

        while(head != null){
            if(head.val != val){
                ListNode node = new ListNode(head.val, null);
                if(res == null) {
                    res = node;
                    current = node;
                }else{
                    current.next = node;
                    current = node;
                }
            }
            head = head.next;
        }

        return res;
    }
}