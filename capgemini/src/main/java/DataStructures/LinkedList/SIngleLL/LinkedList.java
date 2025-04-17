package DataStructures.LinkedList.SIngleLL;

import DataStructures.Node;

public class LinkedList {

    Node head;
    int length=0;
    public boolean isEmpty() {
        return head==null;
    }
    public int get(int data)
    {
        int index=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }
    public boolean contains(int val)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return true;
            }temp=temp.next;
        }
        return false;
    }
    public void addAtIndex(int index,int data)
    {
        if(index<0)
        {
            System.out.println("Index out of bounds");
            return;
        }
        else if(index==0)
        {
            prepend(data);
            return;
        }
        if(isEmpty())
        {
            System.out.println("list is empty");
            return;
        }
        if(index>=length)
        {
            System.out.println("index greater than the length of list");
            return;
        }
        Node newNode=new Node(data);
        Node current=head;
        int counter=0;
        while(counter<index-1)
         {
          counter++;
          current=current.next;
          }
        newNode.next=current.next;
        current.next=newNode;
        length++;
    }
    public void prepend(int data) {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head=newNode;
            length++;
            return;
        }
        Node current=head;
        head=newNode;
        newNode.next=current;
        length++;
    }
    public void append(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            head=newNode;
            length++;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        length++;
    }
public int deleteFirst() {
        int data=head.data;
        head=head.next;

        length-=1;
        return data;
    }
    public int deleteAt(int index){
        Node temp=head;
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==length-1)
        {
            return deleteLast();
        }
        if(index>length-1)
        {
            return -1;
        }
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node Todel=temp.next;
        int value= Todel.data;
        temp.next=Todel.next;
//        Todel.next=null;
        length-=1;
        return value;
    }
    public int deleteLast(){
        Node temp=head;
        int data;
        if(length<=1)
        {
            return deleteFirst();
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        data=temp.data;

        length-=1;
        return data;
    }
    public String toString() {
        if(isEmpty())
        {
            return "[]";
        }

        String ans="[";
        Node current=head;
        while(current.next!=null)
        {
            ans+=current.data+",";
            current=current.next;
        }
        ans+=current.data+"]";
        return ans;
    }

}
