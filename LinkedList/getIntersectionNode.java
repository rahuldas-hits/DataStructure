public class getIntersectionNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        getIntersectionNode solution = new getIntersectionNode();
        ListNode headA = solution.new ListNode(4);
        headA.next = solution.new ListNode(1);
        ListNode intersection = solution.new ListNode(8);
        headA.next.next = intersection;
        intersection.next = solution.new ListNode(4);
        intersection.next.next = solution.new ListNode(5);

        ListNode headB = solution.new ListNode(5);
        headB.next = solution.new ListNode(6);
        headB.next.next = solution.new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = solution.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           ListNode ptr1 = headA;
           ListNode ptr2 = headB;
           if (ptr1 == null || ptr2 == null) {
               return null;
           }

           while (ptr1 != ptr2) {
               ptr1 = (ptr1 == null) ? headB : ptr1.next;
               ptr2 = (ptr2 == null) ? headA : ptr2.next;
           }
           return ptr1;
    }
    
}
