public class rotateRight {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; 
    }


    public static void main(String[] args) {
        rotateRight solution = new rotateRight();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 2;
        ListNode result = solution.rotateRight(head, k);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }


    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        int len = 1;
        ListNode tail = head;
        ListNode newTail = head;

        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        k = k % len;
        if(k ==0) return head;
        tail.next = head;
        int steps = len - k;
        
        for(int i =1; i < steps; i++){
            newTail = newTail.next;
        }   

        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
