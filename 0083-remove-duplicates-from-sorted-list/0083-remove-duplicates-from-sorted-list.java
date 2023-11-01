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
    public ListNode deleteDuplicates(ListNode head) {        
        if(head == null || head.next == null) return head;

        ListNode newHead = new ListNode();
        ListNode newHeadPtr = newHead;
        newHead.val = head.val;
        head = head.next;

        while(head != null){
            if(newHead.val != head.val){
                newHead.next = new ListNode();
                newHead = newHead.next;
                newHead.val = head.val;
            }

            head = head.next;
        }

        System.gc();

        return newHeadPtr;
    }
}