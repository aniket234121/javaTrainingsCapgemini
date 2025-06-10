package Collections.List;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // ======= 🔹 UNIQUE METHODS (not in ArrayList) =======

        // addFirst(E e)
        list.addFirst("Node");
        System.out.println("addFirst() → " + list); // [Node]

        // addLast(E e)
        list.addLast("Tailwind");
        System.out.println("addLast() → " + list); // [Node, Tailwind]

        // getFirst()
        System.out.println("getFirst() → " + list.getFirst()); // Node

        // getLast()
        System.out.println("getLast() → " + list.getLast()); // Tailwind

        // peek()
        System.out.println("peek() → " + list.peek()); // Node

        // poll()
        System.out.println("poll() → " + list.poll()); // Node
        System.out.println("after poll() → " + list); // [Tailwind]

        // offer(E e)
        list.offer("Bootstrap");
        System.out.println("offer() → " + list); // [Tailwind, Bootstrap]

        // push(E e)
        list.push("Angular");
        System.out.println("push() → " + list); // [Angular, Tailwind, Bootstrap]

        // pop()
        System.out.println("pop() → " + list.pop()); // Angular
        System.out.println("after pop() → " + list); // [Tailwind, Bootstrap]

        // removeFirst()
        list.removeFirst();
        System.out.println("removeFirst() → " + list); // [Bootstrap]

        // removeLast()
        list.removeLast();
        System.out.println("removeLast() → " + list); // []

        // ======= 🔸 COMMON METHODS (same in ArrayList) =======

        // add(E e)
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("add() → " + list); // [Java, Python, C++]

        // add(int index, E element)
        list.add(1, "JavaScript");
        System.out.println("add(index, element) → " + list); // [Java, JavaScript, Python, C++]

        // get(int index)
        System.out.println("get(2) → " + list.get(2)); // Python

        // set(int index, E element)
        list.set(2, "Ruby");
        System.out.println("set(2, Ruby) → " + list); // [Java, JavaScript, Ruby, C++]

        // remove(int index)
        list.remove(1);
        System.out.println("remove(1) → " + list); // [Java, Ruby, C++]

        // remove(Object o)
        list.remove("Ruby");
        System.out.println("remove(\"Ruby\") → " + list); // [Java, C++]

        // contains(Object o)
        System.out.println("contains(\"Java\") → " + list.contains("Java")); // true

        // indexOf(Object o)
        System.out.println("indexOf(\"C++\") → " + list.indexOf("C++")); // 1

        // lastIndexOf(Object o)
        list.add("Java");
        System.out.println("lastIndexOf(\"Java\") → " + list.lastIndexOf("Java")); // 2

        // size()
        System.out.println("size() → " + list.size()); // 3

        // isEmpty()
        System.out.println("isEmpty() → " + list.isEmpty()); // false

        // clear()
        list.clear();
        System.out.println("clear() → " + list); // []

        // addAll(Collection)
        LinkedList<String> newList = new LinkedList<>();
        newList.add("HTML");
        newList.add("CSS");
        list.addAll(newList);
        System.out.println("addAll(newList) → " + list); // [HTML, CSS]

        // addAll(index, Collection)
        LinkedList<String> tech = new LinkedList<>();
        tech.add("React");
        tech.add("Vue");
        list.addAll(1, tech);
        System.out.println("addAll(index, tech) → " + list); // [HTML, React, Vue, CSS]

        // containsAll(Collection)
        System.out.println("containsAll(tech) → " + list.containsAll(tech)); // true

        // removeAll(Collection)
        list.removeAll(tech);
        System.out.println("removeAll(tech) → " + list); // [HTML, CSS]

        // retainAll(Collection)
        LinkedList<String> retainList = new LinkedList<>();
        retainList.add("CSS");
        list.retainAll(retainList);
        System.out.println("retainAll(retainList) → " + list); // [CSS]

        // toArray()
        Object[] array = list.toArray();
        System.out.println("toArray() → " + Arrays.toString(array)); // [CSS]

        // iterator()
        list.clear();
        list.add("Tom");
        list.add("Jerry");
        System.out.print("iterator() → ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " "); // Tom Jerry
        }
        System.out.println();

        // forEach (Java 8)
        System.out.print("forEach() → ");
        list.forEach(e -> System.out.print(e + " ")); // Tom Jerry
        System.out.println();

        // listIterator (forward & backward)
        ListIterator<String> listItr = list.listIterator();
        System.out.print("listIterator forward → ");
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " "); // Tom Jerry
        }
        System.out.println();

        System.out.print("listIterator backward → ");
        while (listItr.hasPrevious()) {
            System.out.print(listItr.previous() + " "); // Jerry Tom
        }
        System.out.println();
    }
}


