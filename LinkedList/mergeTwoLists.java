public class mergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // Example usage
        mergeTwoLists solution = new mergeTwoLists();
        ListNode list1 = solution.new ListNode(1, solution.new ListNode(2, solution.new ListNode(4)));
        ListNode list2 = solution.new ListNode(1, solution.new ListNode(3, solution.new ListNode(4)));

        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        printList(mergedList);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur= dummy;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                cur.next = list2;
                list2 = list2.next;
            }else{
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }   

        cur.next = (list1 !=null) ? list1 : list2;
        return dummy.next;
    }
}
