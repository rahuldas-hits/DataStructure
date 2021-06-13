package Tree;
import java.util.*;

class Node{
    int data;
    Node left,right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class CheckGivenTreeIsBST {
    Node root;
    int[] arr = new int[5];

    public boolean checkBST(){
        
        Node curr = root;

        if (root == null)
            return false;

        Stack<Node> stk = new Stack<Node>();

        int count =0 ;
        while( curr != null || !stk.isEmpty()){
            if(curr != null){
                stk.add(curr);
                curr =  curr.left;
            }else{
                
                curr = stk.pop();
                arr[count] = curr.data;
                count++;
                // System.out.println("count is " + count);
                // for(Integer i=0; i<arr.length;i++){
                //     if(arr[i] == 0){
                //         arr[i] = curr.data;
                //     }
                // }
                
                // System.out.println(" - " +curr.data);
                // stk.add(curr);
                curr =  curr.right;
            }
        }
        
        for(Integer i=0; i<arr.length - 1;i++){
            if(arr[i] > arr[i+1]){ 
                System.out.println("false" + arr[i] + " >" + arr[i+1]);
                return false;
            }
        }
        
        return true;
    }
    

    public static void main(String[] args) {
        CheckGivenTreeIsBST ll = new CheckGivenTreeIsBST();
        // non BST
        ll.root = new Node(10);
        ll.root.left = new Node(25);
        ll.root.right = new Node(30);
        ll.root.left.left = new Node(14);
        ll.root.left.right = new Node(5);
        System.out.println("output is ::: " + ll.checkBST());

        CheckGivenTreeIsBST ll1 = new CheckGivenTreeIsBST();
        //BST
        ll1.root = new Node(8);
        ll1.root.left = new Node(3);
        ll1.root.right = new Node(10);
        ll1.root.left.left = new Node(1);
        ll1.root.left.right = new Node(6);

        System.out.println("output is ::: " + ll1.checkBST());

    }
}
