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
    public int getDecimalValue(ListNode head) {
        while(head != null && head.val == 0){
            head = head.next;
        }

        return head == null ? 0 : computeBinary(head);
    }

    public int computeBinary(ListNode head){
        int length = -1, res = 0;
        ListNode ptr = head;

        while(ptr != null){
            length++;
            ptr = ptr.next;
        }

        ptr = head;

        while(ptr != null){
            res = res + (ptr.val * (int)Math.pow(2, length--));
            ptr = ptr.next;
        }

        return res;
    }
}