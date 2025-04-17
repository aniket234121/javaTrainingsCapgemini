package DataStructures.Queue;

public class QueueLL {
    private class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public int getSize()
    {
        return this.size;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail=tail.next;
        size++;
    }
    public void dequeue() {
        if(head==null)
        {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("dequeue "+head.data);
        head=head.next;
        size--;
    }
    public void printQueue() {
        Node temp = head;
        System.out.print("[ ");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("]");
    }
}
