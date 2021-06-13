package Graph;


class Node{
    int data;
    Node left,right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class BSF {
    Node root;

    public void findBSF(){
        if (root == null)
            return;

        Node curr = root;
    
    }

    public static void main(String[] args) {
        BSF l = new BSF();
        l.root = new Node(1);
        

    }
}
