package DataStructures.LinkedList.CircularLL;

public class Driver {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.append(12);
        list.append(13);
        list.append(14);
        list.append(15);
        list.removeLast();
        list.prepend(1);
        list.prepend(2);
        list.removeFirst();
        System.out.println(list);
    }
}
