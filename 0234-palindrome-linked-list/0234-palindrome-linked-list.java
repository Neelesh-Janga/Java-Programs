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

        boolean evenNodeCheck;

        while(true){
            if(fast.next == null || fast.next.next == null){
                evenNodeCheck = fast.next == null ? false : true;
                break;
            }

            fast = fast.next.next;
            
            // Reversing the nodes
            slow.next = prev;
            prev = slow;
            slow = nextNode;
            nextNode = nextNode.next;
        }

        if(evenNodeCheck){
            slow.next = prev;
            prev = slow;
        }

        while(prev != null && nextNode != null){
            if(prev.val != nextNode.val) return false;
            prev = prev.next;
            nextNode = nextNode.next;
        }

        fast = null;
        slow = null;
        head = null;

        return true;
    }
}
