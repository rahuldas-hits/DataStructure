public class isPalindrome {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        isPalindrome ip = new isPalindrome();
        boolean result = ip.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }



      public ListNode mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

  public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       ListNode next = null;
       while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
       }
       return prev;
  } 

    public boolean isPalindrome(ListNode head) {

            if(head == null || head.next == null){
                return true;
            }
            // first middle   
            ListNode list2 = mid(head);
            // divide the list in two part
            ListNode temp = head;
            while(temp.next != list2){
                temp = temp.next;
            }
            temp.next = null;
            // reverse the 2nd list
            ListNode head2 = reverseList(list2);
            // then compare the both list
            ListNode temp1 = head;
            ListNode temp2 = head2;

            while(temp1 != null && temp2 != null){
                if(temp1.val != temp2.val){
                    return false;
                }else {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
               
            }

        return true;
    }
}
