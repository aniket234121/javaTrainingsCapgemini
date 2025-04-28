package Collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list.isEmpty());
        System.out.println(list.offer("Hello"));
        list.add("this");
        list.add("is");
        list.add("a");
//        list.add("linkedlist");
        list.addFirst("LL");
        list.addLast(".");
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains("LL"));
    }
}
