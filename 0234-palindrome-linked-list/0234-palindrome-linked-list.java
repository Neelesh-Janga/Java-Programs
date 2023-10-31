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
        ListNode headPtr = head;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(headPtr != null){
            list.add(headPtr.val);
            headPtr = headPtr.next;
        }
        
        headPtr = head;

        for(int i = list.size()-1; i >= 0; i--){
            if(headPtr.val != list.get(i)) return false;
            headPtr = headPtr.next;
        }

        return true;
    }
}