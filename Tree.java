// Height of Tree
class Node{
    int data;
    Node left,right;

    Node(int data){
     this.data = data;
     left = right = null;
    }
}
public class Tree{
    static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String args[]){
       Node root = new Node(10);
       root.left = new Node(20);
       root.right = new Node(30);
       root.left.left = new Node(40);
       root.left.right = new Node(50);

       System.out.println("height = " + height(root));
    }
}