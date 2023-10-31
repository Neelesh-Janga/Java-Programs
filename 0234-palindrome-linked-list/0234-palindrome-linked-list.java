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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        if(head.next.next == null){
            return head.val == head.next.val;
        }

        ListNode fast = head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode nextNode = slow.next;

        int iterations = 0;


        while(true){
            if(fast.next == null || fast.next.next == null){
                iterations = fast.next == null ? 0 : 1;
                break;
            }

            fast = fast.next.next;
            
            slow.next = prev;

            prev = slow;
            slow = nextNode;
            nextNode = nextNode.next;
        }

        if(iterations == 1){
            slow.next = prev;
            prev = slow;
        }

        while(prev != null && nextNode != null){
            if(prev.val != nextNode.val) return false;
            prev = prev.next;
            nextNode = nextNode.next;
        }

        return true;
    }
}