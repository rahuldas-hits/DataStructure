public class deleteDuplicates {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // Example usage
        deleteDuplicates solution = new deleteDuplicates();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(1);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(3);

        ListNode result = solution.deleteDuplicates(head);
        // Print the resulting linked list
        System.out.print("Resulting linked list after removing duplicates: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
