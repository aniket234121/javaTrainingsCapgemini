package Collections.List;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add(E e)
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("add() → " + list); // add() → [Java, Python, C++]

        // add(int index, E element)
        list.add(1, "JavaScript");
        System.out.println("add(index, element) → " + list); // add(index, element) → [Java, JavaScript, Python, C++]

        // get(int index)
        System.out.println("get(2) → " + list.get(2)); // get(2) → Python

        // set(int index, E element)
        list.set(2, "Ruby");
        System.out.println("set(2, Ruby) → " + list); // set(2, Ruby) → [Java, JavaScript, Ruby, C++]

        // remove(int index)
        list.remove(1);
        System.out.println("remove(1) → " + list); // remove(1) → [Java, Ruby, C++]

        // remove(Object o)
        list.remove("Ruby");
        System.out.println("remove(\"Ruby\") → " + list); // remove("Ruby") → [Java, C++]

        // contains(Object o)
        System.out.println("contains(\"Java\") → " + list.contains("Java")); // contains("Java") → true

        // indexOf(Object o)
        System.out.println("indexOf(\"C++\") → " + list.indexOf("C++")); // indexOf("C++") → 1

        // lastIndexOf(Object o)
        list.add("Java");
        System.out.println("lastIndexOf(\"Java\") → " + list.lastIndexOf("Java")); // lastIndexOf("Java") → 2

        // size()
        System.out.println("size() → " + list.size()); // size() → 3

        // isEmpty()
        System.out.println("isEmpty() → " + list.isEmpty()); // isEmpty() → false

        // clear()
        list.clear();
        System.out.println("clear() → " + list); // clear() → []

        // addAll(Collection)
        ArrayList<String> newList = new ArrayList<>();
        newList.add("HTML");
        newList.add("CSS");
        list.addAll(newList);
        System.out.println("addAll(newList) → " + list); // addAll(newList) → [HTML, CSS]

        // addAll(index, Collection)
        ArrayList<String> lang = new ArrayList<>();
        lang.add("JS");
        lang.add("React");
        list.addAll(1, lang);
        System.out.println("addAll(index, lang) → " + list); // addAll(index, lang) → [HTML, JS, React, CSS]

        // containsAll(Collection)
        System.out.println("containsAll(lang) → " + list.containsAll(lang)); // containsAll(lang) → true

        // removeAll(Collection)
        list.removeAll(lang);
        System.out.println("removeAll(lang) → " + list); // removeAll(lang) → [HTML, CSS]

        // retainAll(Collection)
        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("CSS");
        list.retainAll(retainList);
        System.out.println("retainAll(retainList) → " + list); // retainAll(retainList) → [CSS]

        // toArray()
        Object[] arr = list.toArray();
        System.out.println("toArray() → " + Arrays.toString(arr)); // toArray() → [CSS]

        // iterator()
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        Iterator<String> it = names.iterator();
        System.out.print("iterator() → ");
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // iterator() → Alice Bob
        }
        System.out.println();

        // forEach (Java 8)
        System.out.print("forEach() → ");
        names.forEach(e -> System.out.print(e + " ")); // forEach() → Alice Bob
        System.out.println();

        // listIterator() (forward and backward)
        ListIterator<String> li = names.listIterator();
        System.out.print("listIterator() forward → ");
        while (li.hasNext()) {
            System.out.print(li.next() + " "); // listIterator() forward → Alice Bob
        }
        System.out.println();

        System.out.print("listIterator() backward → ");
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " "); // listIterator() backward → Bob Alice
        }
        System.out.println();
    }
}
