public class removeNthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    ListNode dummy = new ListNode(0);

        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head;
            }

            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode nodeDeleted = slow.next;

        if (nodeDeleted != null) {
            slow.next = nodeDeleted.next;
        }

        // Return updated head
        return dummy.next;
    }
}
