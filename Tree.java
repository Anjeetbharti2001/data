// Sum of All Node
class Node{
    int data;
    Node left, right; 

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class Tree {
    static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        System.out.println("sum = " + sum(root));
    }
}