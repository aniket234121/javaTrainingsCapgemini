package DataStructures;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.addLast(89);
        list.addLast(90);
        list.addFirst(10);
        list.addAtIndex(12,list.size-1);
        System.out.println(list);
        list.removeFirst();

        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeAtIndex(3);
        System.out.println(list);
    }
}
