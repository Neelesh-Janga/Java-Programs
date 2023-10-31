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
    private ListNode headB = null;
    private boolean check;

    public boolean isPalindrome(ListNode head) {
        this.headB = head;
        this.check = true;
        isPalindromeTrue(head);
        return this.check;
    }

    public void isPalindromeTrue(ListNode headA) {
        if(headA != null){
            isPalindromeTrue(headA.next);
            if(headA.val != headB.val) {
                this.check = false;
            }
            this.headB = this.headB.next;
        }
    }
}