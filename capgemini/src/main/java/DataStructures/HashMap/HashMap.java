package DataStructures.HashMap;

import DataStructures.scenario.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class HashMap {
    private class Node{
        Product key;
        Integer value;
        Node next;
        public Node(Product key, Integer Value){
            this.key=key;
            this.value=Value;
        }
    }

    public int getIndex(Product key){
        return Math.abs(key.hashCode())%capacity;
    }
    private final float loadFactor = 0.75f;
    private int size;
    private int capacity;
    private Node [] Buckets;
    public int getSize(){
        return size;
    }
    public HashMap(){
        capacity=16;
        Buckets=new Node[capacity];
    }
    public HashMap(int capacity){
        this.capacity=capacity;
        Buckets=new Node[capacity];
    }
    public void put(Product key, Integer Value){
        int index=getIndex(key);
//        if(Buckets[index]==null){
//            Buckets[index]=new Node(key,Value);
//            size++;
//            return;
//        }
        Node head=Buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=Value;
                return;
            }
        }
        Node newNode=new Node(key,Value);
        newNode.next=Buckets[index];
        Buckets[index]=newNode;
        this.size++;
        if(size>=capacity*loadFactor){
            reSize();
        }
    }
    public Integer get(Product key){
        int index=getIndex(key);
        Node head=Buckets[index];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public Integer remove(Product key){
        int index=getIndex(key);
        Node head=Buckets[index];
        Node prev=null;
        while(head!=null){
            if(head.key.equals(key)){
                if(prev==null){
                    Buckets[index]=head.next;
                }
                else {
                    prev.next=head.next;
                }
                size--;
                return head.value;
            }
            prev=head;
            head=head.next;
        }
        return null;
    }
    public void reSize()
    {
        System.out.println("resizing");
        capacity=capacity*2;
        Node [] oldBuckets=Buckets;
        Buckets=new Node[capacity];
        size=0;
        for(int i=0;i<oldBuckets.length;i++){
            Node head=oldBuckets[i];
            while(head!=null)
            {
                put(head.key,head.value);
                head=head.next;
            }
        }

    }
    public ArrayList<Product> keys(){
        ArrayList<Product> keys=new ArrayList<>();
        for(int i=0;i<Buckets.length;i++){
            Node head=Buckets[i];
            while(head!=null)
            {
                keys.add(head.key);
                head=head.next;
            }
        }
        return keys;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("");
       for(int i=0;i<Buckets.length;i++){
           Node head=Buckets[i];
           while(head!=null)
           {
               builder.append("[ "+head.key+" quantity: "+head.value+" ]\n");
               head=head.next;
           }
       }

       return builder.toString();
    }
}
