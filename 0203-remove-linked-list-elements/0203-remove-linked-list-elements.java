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
        ListNode dummy = new ListNode(0);  // 더미 노드 생성
        dummy.next = head;
        ListNode before = dummy;
        ListNode temp = head;
        
        while (temp != null) {
            if (temp.val == val) {
                before.next = temp.next;  // 노드 제거
            } else {
                before = temp;
            }
            temp = temp.next;
        }
        
        return dummy.next;  // 새로운 head 반환
    }
}
