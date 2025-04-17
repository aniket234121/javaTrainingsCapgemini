package DataStructures.LinkedList.CircularDLL;

import DataStructures.Node;

public class DoublyCircuarLL {
    private class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    private int length;
    private Node head;
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
         addFirst(data);
         return;
        }
        Node lastNode=head.prev;
        newNode.prev=lastNode;
        newNode.next=head;
        lastNode.next=newNode;
        head.prev=newNode;
        length++;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
            length++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;

        Node current = head;
        while(current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev=current;
        head = newNode;
        length++;
    }
    public void addAtIndex(int data,int index)
    {
        if(length==0)
        {
            System.out.println("List is empty");
            return;
        }
        if(index==0)
        {
            addFirst(data);
            return;
        }
        else if(index<0||index>length-1)
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
        length++;

    }

    public void removeLast(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }

        Node lastNode=head.prev;
        Node prevNode=lastNode.prev;
        prevNode.next=head;
        head.prev=prevNode;
        length--;


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
        } else if (index==length-1) {
            removeLast();
            return;

        } else if(index<0 || index>=length)
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
        length--;

    }
    public void removeFirst(){
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node lastNode=head.prev;
        lastNode.next=head.next;
        head.next.prev=lastNode;
        head=head.next;
        length--;
    }
    public String toString()
    {
        if(length==0)
        {
            return "[]";
        }
        String ans="[";
        Node temp=head;
        while(temp.next!=head)
        {
            ans+=temp.data+",";
            temp=temp.next;
        }
        ans+=temp.data+"]";
        return ans;
    }
}
