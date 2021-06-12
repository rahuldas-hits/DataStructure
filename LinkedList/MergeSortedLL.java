package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int item){
        data = item;
        next = null;
    }
}

class Merge{
    Node sortedMerge(Node Node1, Node Node2){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        while(true){
       
            if(Node1 == null){
                tail.next = Node2;
            }

            if(Node2 == null){
                tail.next = Node1;
            }

            if(Node1.data > Node2.data){
                tail.next = Node2;
                Node2 = Node2.next;
            }else{
                tail.next = Node1;
                Node1 = Node1.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}

public class MergeSortedLL {
    Node root;

    public void insertAtEnd(Node A){
        
        if(root == null){
            root = A;
        }else{
            Node temp = root;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = A;
        }
    }

    public static void main(String[] args) {
        MergeSortedLL ll1 = new MergeSortedLL();
        MergeSortedLL ll2 = new MergeSortedLL();
        
        ll1.root = new Node(2);
        ll1.root.next = new Node(5);
        ll1.root.next.next = new Node(7);
        ll1.root.next.next.next = new Node(9);

        ll2.root = new Node(1);
        ll2.root.next = new Node(3);
        ll2.root.next.next = new Node(6);
        ll2.root.next.next.next = new Node(10);
    }
    
}
