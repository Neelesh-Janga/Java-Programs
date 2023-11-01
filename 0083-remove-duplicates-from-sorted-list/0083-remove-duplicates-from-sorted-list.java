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

        ListNode prev = head;
        ListNode follow = head;
        ListNode current = head.next;
        
        while(current != null){
            if(current.val != prev.val){
                prev.next = current;
                if(follow != prev)
                    follow.next = null;
                prev = current;
            }
            follow = current;
            current = current.next;
        }

        if(follow != prev)
            follow.next = null;
        follow = null;

        prev.next = current;
        prev = current;

        return head;
    }
}