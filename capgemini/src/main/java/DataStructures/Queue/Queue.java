package DataStructures.Queue;

public class Queue {
    private int [] queue;
    private int front;
    private int rear;
    private int size;
    public Queue(int size) {
        queue=new int[size];
        rear=-1;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==queue.length;
    }
    public void enquee(int value){
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%queue.length;
        queue[rear]=value;
        size++;
    }
    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        front=(front+1)%queue.length;
        size--;
        return value;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        if(isEmpty()) {
            return "Queue is empty";
        }
        else {
            StringBuffer s=new StringBuffer("[ ");
            int front=this.front;
            int rear=this.rear;
            while(front!=rear) {
                s.append(queue[front]+" - ");
                front=(front+1)%queue.length;
            }
            s.append(queue[front]+" ]");
            return s.toString();
        }
    }

}
