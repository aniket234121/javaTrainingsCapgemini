package Collections.List;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // ======= 🔹 UNIQUE VECTOR METHODS =======

        // capacity()
        System.out.println("initial capacity() → " + vector.capacity()); // Default 10

        // ensureCapacity(int minCapacity)
        vector.ensureCapacity(20);
        System.out.println("after ensureCapacity(20) → " + vector.capacity()); // ≥ 20

        // trimToSize()
        vector.add("A");
        vector.trimToSize();
        System.out.println("after trimToSize() → " + vector.capacity()); // Size shrinks to element count

        // firstElement()
        System.out.println("firstElement() → " + vector.firstElement()); // A

        // lastElement()
        System.out.println("lastElement() → " + vector.lastElement()); // A

        // elements() → Enumeration
        Enumeration<String> e = vector.elements();
        System.out.print("elements() → ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " "); // A
        }
        System.out.println();

        // ======= 🔸 COMMON LIST METHODS =======

        // add(E e)
        vector.add("B");
        vector.add("C");
        System.out.println("add() → " + vector); // [A, B, C]

        // get(int index)
        System.out.println("get(1) → " + vector.get(1)); // B

        // set(int index, E element)
        vector.set(1, "X");
        System.out.println("set(1, X) → " + vector); // [A, X, C]

        // remove(int index)
        vector.remove(2);
        System.out.println("remove(2) → " + vector); // [A, X]

        // contains(Object o)
        System.out.println("contains(\"A\") → " + vector.contains("A")); // true

        // size()
        System.out.println("size() → " + vector.size()); // 2

        // isEmpty()
        System.out.println("isEmpty() → " + vector.isEmpty()); // false

        // clear()
        vector.clear();
        System.out.println("clear() → " + vector); // []
    }
}

