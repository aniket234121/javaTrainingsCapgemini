package DataStructures.LinkedList.DoublyLL;

import DataStructures.LinkedList.Node;

public class DoublyLinkedList {
    Node head;
    int size;

    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        size--;
    }
    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node prev = current.prev;
        prev.next = null;
        current.prev=null;
        size--;
    }
    public void removeAtIndex(int index) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(index==0)
        {
            removeFirst();
            return;
        } else if (index==size-1) {
            removeLast();
            return;

        } else if(index<0 || index>=size)
        {
            System.out.println("Index out of bounds");
            return;
        }
        Node current = head;
        while(index!=0)
        {
            current = current.next;
            index--;
        }
        Node prevNode = current.prev;
        Node nextNode=current.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        current.prev=null;
        current.next=null;
        size--;

    }
    public boolean isEmpty() {
        return size==0;
    }
    public int size() {
        return size;
    }
    public void addAtIndex(int data,int index)
    {
        if(size==0)
        {
            System.out.println("List is empty");
            return;
        }
        if(index==0)
        {
            addFirst(data);
            return;
        }
        else if(index<0||index>size-1)
        {
            System.out.println("Index out of bounds");
            return;
        }
        Node newNode = new Node(data);
        Node current=head;
        while(index!=0)
        {
            current=current.next;
            index--;
        }
        Node previous=current.prev;
        previous.next=newNode;
        newNode.prev=previous;
        newNode.next=current;
        current.prev=newNode;
        size++;

    }
    public void addFirst(int data) {
        Node newNode=new Node(data);

        if(head==null) {
            head=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            size++;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        newNode.prev=current;
        size++;

    }
    public String toString()
    {
        if(size==0)
        {
            return "[]";
        }
        String ans="[";
        Node temp=head;
        while(temp.next!=null)
        {
            ans+=temp.data+",";
            temp=temp.next;
        }
        ans+=temp.data+"]";
        return ans;
    }
    public void reverse()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            return;
        }
        while(current.next!=null)
        {
            Node nextNode=current.next;
            Node temp=current.next;
            current.next=current.prev;
            current.prev=nextNode;
            current=nextNode;
        }
            head=current;
            Node nextNode=current.next;
            Node temp=current.next;
            current.next=current.prev;
            current.prev=nextNode;
            current=nextNode;

    }
}
