class Node
{
    int data;
    Node leftChild;
    Node rightChild;
    Node(int x)
    {
        data = x;
        // This is not necessary to initialize left and right as null
        // Because they are by default declared as null in Java
        leftChild = null;
        rightChild = null;
    }
}

public class LearnTree {
 
    public static void main(String[] args) {
        
        Node root = new Node(10);
        // If you want to create an empty tree you can do so by assigning null to root
        // Like this
        // Node root = null;
        root.leftChild = new Node(20);
        root.rightChild = new Node(30);
        root.leftChild.leftChild = new Node(40);
    }
}
