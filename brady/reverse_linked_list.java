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
  
    // O(n) time, O(1) space
    public ListNode reverseList(ListNode head) {

        // Handle case where the linked list is empty
        if (head == null) return head;

        ListNode p1 = head;
        ListNode p2 = head.next;
        head.next = null;

        while (p2 != null) {
            ListNode p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }

        return p1;
    }
}
