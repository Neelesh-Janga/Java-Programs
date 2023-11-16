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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode head = list;
        int carry = 0;

        while(l1 != null && l2 != null){
            head.val = (l1.val + l2.val + carry) % 10;
            head.next = new ListNode();
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }

        while(l1 != null){
            head.val = (l1.val + carry) % 10;
            head.next = new ListNode();
            carry = (l1.val + carry) / 10;
            l1 = l1.next;
            head = head.next;
        }

        while(l2 != null){
            head.val = (l2.val + carry) % 10;
            head.next = new ListNode();
            carry = (l2.val + carry) / 10;
            l2 = l2.next;
            head = head.next;
        }

        if(carry == 1){
            head.val = carry;
            head = head.next;
        }

        head = list;
        
        while(head != null && head.next != null){
            if(head.next.next == null && carry == 0)
                head.next = null;
            head = head.next;
        }

        return list;
    }
}
