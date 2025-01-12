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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode before = dummy;
        ListNode temp = head;
        while(temp != null){
            if(temp.val == val){
                before.next = temp.next;
            } else{
                before = temp;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}