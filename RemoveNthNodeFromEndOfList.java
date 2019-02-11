/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        n = length - n;
        if (head == null) {
            return null;
        }
        if (n == 0) {
            return head.next;
        }
        p = head;
        ListNode pre = null;
        while (n > 0) {
            if (n == 1) {
                pre = p;
            }
            p = p.next;
            n--;
        }
        if (pre != null)
            pre.next = p.next;
        return head;
    }
}
