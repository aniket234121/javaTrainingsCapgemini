package DataStructures.LinkedList.CircularDLL;

public class Driver {
    public static void main(String[] args) {
        DoublyCircuarLL list=new DoublyCircuarLL();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(13);
        list.addLast(23);
        System.out.println(list);
        list.addAtIndex(99,3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addLast(89);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeAtIndex(1);
        System.out.println(list);
    }
}
