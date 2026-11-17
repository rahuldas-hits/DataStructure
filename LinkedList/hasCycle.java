public class hasCycle {

    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        hasCycle hc = new hasCycle();
        ListNode head = hc.new ListNode(1);
        head.next = hc.new ListNode(2);
        head.next.next = hc.new ListNode(3);
        head.next.next.next = hc.new ListNode(4);
        head.next.next.next.next = hc.new ListNode(5);

        // Create a cycle for testing
        head.next.next.next.next.next = head.next; // 5 -> 2

        boolean result = hc.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        } 
        return false;
    }
}
