package DataStructures.Queue;

public class QueueLLDriver {
    public static void main(String[] args) {
        QueueLL queue=new QueueLL();
        queue.enqueue(12);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.enqueue(4);
        queue.printQueue();
        System.out.println(queue.getSize());
    }
}
