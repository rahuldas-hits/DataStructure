public class oddEvenList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {
        // Example usage
        oddEvenList solution = new oddEvenList();
        ListNode head = solution.new ListNode(1, solution.new ListNode(2, solution.new ListNode(3, solution.new ListNode(4, solution.new ListNode(5)))));

        ListNode result = solution.oddEvenList(head);
        printList(result);
    }


    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public ListNode oddEvenList(ListNode head) {
        //marked the odd with 1 and even with 0 with counter vatiable
        //then create two new LL one will store the even node and will
        // odd value for the even list at the end add null
        // when we linked the odd node to odd then keep the even node to a temp
        if(head == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenNode = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenNode;
        return head;
    }
}
