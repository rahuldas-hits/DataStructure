//package LinkedList;

public class LL {

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
    
        printLL(head);
    }

    public static Node insertAtFirst(Node head, int data){
        
        return head;
    }

    public static Node insertAtLast(Node head, int data){
        return head;
    }

    public static Node insertAtIndex(Node head, int index, int data){
        return head;
    }

    public static Node deleteFirst(Node head){
        return head;
    }

    public static Node deleteLast(Node head){
        return head;
    }

    public static Node deleteAtIndex(Node head, int index){
        return head;
    }

    // Itearative Approach
    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    //recursive Approach
    public static void printLLRec(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " -> ");
        printLLRec(head.next);
    }


}
