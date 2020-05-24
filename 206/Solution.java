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
     public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode newHeadNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
     }
    
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}
