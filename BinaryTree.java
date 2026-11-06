public class BinaryTree {
    class Node {
        int val;
        Node left = null;
        Node right = null;

        Node(int val) {
            this.val = val;
        }
    }

    Node root = null;

    void insert(int val) {
        Node nn = new Node(val);
        if(root == null){
            this.root = nn;
            return;
        }

        
    }
}
