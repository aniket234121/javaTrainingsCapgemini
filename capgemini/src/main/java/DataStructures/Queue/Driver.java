package DataStructures.Queue;

public class Driver {
    public static void main(String[] args) {
        Queue queue=new Queue(4);
        queue.enquee(12);
        queue.enquee(1);
        queue.enquee(3);
        queue.enquee(4);
        System.out.println("size "+ queue.getSize());
        System.out.println(queue);
        System.out.println("deque "+queue.dequeue());
        System.out.println(queue);
        System.out.println("dequeue "+queue.dequeue());

        queue.enquee(99);
        System.out.println(queue);

    }
}
