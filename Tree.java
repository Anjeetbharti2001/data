class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Tree{
    public static void main(String [] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        System.out.println("Root : " + root.data );
    }
}