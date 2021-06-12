package Tree;
// non-recursive java program for inorder traversal
import java.util.Stack;


class Node {
    int data;
    Node left,right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;
    void recursiveIndorder(){
        if (root == null)
            return;

        Stack<Node> stk = new Stack<Node>();    
        Node curr = root;


        while(curr != null || !stk.isEmpty()){
            if(curr != null){
                stk.push(curr);
                // System.out.println(" stack value is"+ stk.peek());
                curr = curr.left;
            }else{
                curr = stk.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();   
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        // System.out.println( "root data is " + tree.root.data);
        tree.recursiveIndorder();
    }
}
