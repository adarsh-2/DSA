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

public class printNodesAtKDist
{
    static void printK(Node root, int k)
    {
        if(root == null) return;

        if(k==0)
        {
            System.out.println(root.data);
            return;
        }
        
        printK(root.leftChild,k-1);
        printK(root.rightChild,k-1);
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.rightChild.leftChild = new Node(5);

        printK(root,2);
    }
}
