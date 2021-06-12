package Tree;
import java.util.*;
import Tree.Node;
import java.util.Queue;

// class Node {
//     int data;
//     Node left,right;

//     public Node(int item){
//         data = item;
//         left = right = null;
//     }
// }

public class LevelOrder {
    Node root;

    void iteratativeLevelOrder(){
        if (root == null)
            return;

        Node curr = root;
        
        Queue<Node> queue = new LinkedList<Node>();
        System.out.println(curr.data);
        queue.add(curr);
        while(!queue.isEmpty()){
            curr = queue.poll();
            if(curr.left != null){
                System.out.println(curr.left.data);
                queue.add(curr.left);
            }
            if(curr.right != null){
                System.out.println(curr.right.data);
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrder tree = new LevelOrder();   
        tree.root = new Node(10);
        tree.root.left = new Node(25);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(5);
        tree.iteratativeLevelOrder();
    }


}
