public class detectCycle {

    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        detectCycle dc = new detectCycle();
        ListNode head = dc.new ListNode(1);
        head.next = dc.new ListNode(2);
        head.next.next = dc.new ListNode(3);
        head.next.next.next = dc.new ListNode(4);
        head.next.next.next.next = dc.new ListNode(5);

        // Create a cycle for testing
        head.next.next.next.next.next = head.next; // 5 -> 2

        ListNode result = dc.detectCycle(head);
        if (result != null) {
            System.out.println("Cycle detected at node with value: " + result.val);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        
        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                isCycle = true;
                break;
            }
        }

        if(!isCycle){
            return null;
        }

        slow = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
