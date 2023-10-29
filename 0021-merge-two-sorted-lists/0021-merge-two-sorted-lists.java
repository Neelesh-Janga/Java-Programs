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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode head1 = list1, head2 = list2, previous = head1;
        
        while(head1 != null && head2 != null){
            if(head1 == null){
                previous.next = head2;
                head2 = null;
            }

            if(head1.val > head2.val){
                previous.next = head2;
                previous = head2;
                head2 = head2.next;
                previous.next = head1;
            }else{
                previous = head1;
                head1 = head1.next;
            }
        }

        if(head2 != null) previous.next = head2;

        previous = null;
        head2 = null;
        head1 = null;
        list2 = null;

        return list1;
    }
}