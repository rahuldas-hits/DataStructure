public class removeNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

   public ListNode removeNthFromEnd(ListNode head, int n) {
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

    public static void main(String[] args) {
        // Example usage
        removeNthFromEnd solution = new removeNthFromEnd();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int n = 2;
        ListNode result = solution.removeNthFromEnd(head, n);
        // Print the resulting linked list
        System.out.print("Resulting linked list after removing " + n + "th node from the end: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
