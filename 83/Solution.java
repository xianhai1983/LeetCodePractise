class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while(cur.next != null) {
            while(cur.val == cur.next.val) {
                cur.next = cur.next.next;
                if (cur.next == null) return head;
            }
            cur = cur.next;
        }
        return head;
    }
}
