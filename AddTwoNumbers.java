class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode node = l3;
        int g = 0, val = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                val = l2.val + g;
            } else if (l2 == null) {
                val = l1.val + g;
            } else {
                val = l1.val + l2.val + g;
            }
            g = val / 10;
            node.val = val % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (g == 1) {
                node.next = new ListNode(g);
            } else if (l1 != null || l2 != null) {
                node.next = new ListNode(0);
            }
            node = node.next;
        }
        return l3;
    }
}
