class Node
{
    int data;
    Node leftChild;
    Node rightChild;
    Node(int x)
    {
        data = x;
    }
}

public class inorderTraversal
{

    static void travel(Node root)
    {
        if(root!=null)
        {
            travel(root.leftChild);
            System.out.println(root.data);
            travel(root.rightChild);
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.rightChild.leftChild = new Node(5);

        travel(root);
    }
}
