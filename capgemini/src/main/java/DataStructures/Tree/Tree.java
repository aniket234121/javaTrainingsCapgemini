package DataStructures.Tree;

public class Tree {
    private class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node root;
    public void add(int data)
    {
        root=addNode(root,data);
    }
    private Node addNode(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        else if(data<root.data)
        {
            root.left=addNode(root.left,data);
        }
        else if(data>root.data)
        {
            root.right=addNode(root.right,data);
        }
        return root;
    }
    public void print()
    {
        printRecursive(root);
    }
    private void printRecursive(Node root)
    {
       if(root==null)
       {
           return;
       }
       printRecursive(root.left);
       System.out.print(root.data+" ");
       printRecursive(root.right);

    }
    public boolean find(int data)
    {
        return findRecursive(root,data);
    }
    private boolean findRecursive(Node root,int data)
    {
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        if(root.data>data)
            return findRecursive(root.left,data);
        else
            return findRecursive(root.right,data);
    }
}
