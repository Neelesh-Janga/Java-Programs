/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null){
            ListNode node = headB;
            while(node != null){
                if(headA == node) return node;
                node = node.next;
            }
            headA = headA.next;
        }

        return null;
    }
}