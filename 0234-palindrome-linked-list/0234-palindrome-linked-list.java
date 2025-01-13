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
        ArrayList<Integer> stack = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            stack.add(temp.val);
            temp = temp.next;
        }
        while(head != null){
            if(head.val == stack.get(stack.size()-1)){
                stack.remove(stack.size()-1);
            } 
            head = head.next;
        }
        if(stack.size() == 0) return true;
        return false;
    }
}