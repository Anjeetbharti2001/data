class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}
public class Tree{
    static int countNodes(Node root){
        if(root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Total Nodes = " + countNodes(root));

    }
}