package DataStructures.HashMap;

public class HashMap {
    private class Node{
        Integer key;
        String value;
        Node next;
        public Node(Integer key,String Value){
            this.key=key;
            this.value=Value;
        }
    }

    public int getIndex(Integer key){
        return Math.abs(key.hashCode())%capacity;
    }
    private final float loadFactor = 0.75f;
    private int size;
    private int capacity;
    private Node [] Buckets;
    public HashMap(){
        capacity=16;
        Buckets=new Node[capacity];
    }
    public HashMap(int capacity){
        this.capacity=capacity;
        Buckets=new Node[capacity];
    }
    public void put(Integer key,String Value){
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
    public String get(Integer key){
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
}
