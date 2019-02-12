/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = new ListNode(l1.val);
                p = p.next;
                l1 = l1.next;
            } else {
                p.next = new ListNode(l2.val);
                p = p.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            p.next = new ListNode(l1.val);
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            p.next = new ListNode(l2.val);
            p = p.next;
            l2 = l2.next;
        }
        return l3.next;
    }
}
