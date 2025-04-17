package DataStructures.LinkedList.CircularLL;

public class CircularLinkedList {
    private class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private int size;
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            head.next = head;
            size++;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=head)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.next = head;
        size++;
    }
    public void prepend(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            append(data);
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=head)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void removeLast(){
        if(isEmpty())
        {
            System.out.println("list is empty");
            return ;
        }
        Node CurrentNode=head;
        while(CurrentNode.next.next!=head)
        {
            CurrentNode=CurrentNode.next;
        }
        CurrentNode.next=head;
        size--;

    }
    public void removeFirst()
    {
        if(isEmpty())
        {
            System.out.println("list is empty");
            return;
        }

        Node currentNode=head;
        while(currentNode.next!=head)
        {
            currentNode=currentNode.next;
        }
        head=head.next;
        currentNode.next=head;
        size--;
    }
    public String toString()
    {
        if(isEmpty())
        {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node currentNode = head;
        while(currentNode.next!=head)
        {
            sb.append(currentNode.data+"-->");
            currentNode = currentNode.next;
        }
        sb.append(currentNode.data+"]");
        return sb.toString();
    }


}
