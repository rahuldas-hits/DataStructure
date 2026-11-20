public class removeElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
    }    
}

    public static void main(String[] args) {
        // Example usage
        removeElements solution = new removeElements();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(6);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(4);
        head.next.next.next.next.next = solution.new ListNode(5);
        head.next.next.next.next.next.next = solution.new ListNode(6);

        int valToRemove = 6;
        ListNode result = solution.removeElements(head, valToRemove);
        // Print the resulting linked list
        System.out.print("Resulting linked list after removing " + valToRemove + ": ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Bypass the matching node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
    
}
