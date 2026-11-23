public class swapPairs {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        swapPairs solution = new swapPairs();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        
        ListNode result = solution.swapPairs(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }


    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        ListNode temp = head.next.next;
        newHead.next = head;
        head.next = swapPairs(temp);
        return newHead;
    }
}
