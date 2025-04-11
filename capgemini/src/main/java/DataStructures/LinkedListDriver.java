package DataStructures;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println(list);
        list.append(23);
        list.append(24);
        list.append(2);
        list.append(-12);
        list.prepend(1);
        list.addAtIndex(2,30);

        list.deleteLast();
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.get(23));

    }
}
