package Collections.List;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // ======= 🔹 UNIQUE STACK METHODS =======

        // push(E item)
        stack.push("HTML");
        stack.push("CSS");
        stack.push("JavaScript");
        System.out.println("push() → " + stack); // [HTML, CSS, JavaScript]

        // pop()
        System.out.println("pop() → " + stack.pop()); // JavaScript
        System.out.println("after pop() → " + stack); // [HTML, CSS]

        // peek()
        System.out.println("peek() → " + stack.peek()); // CSS

        // empty()
        System.out.println("empty() → " + stack.empty()); // false

        // search(Object o)
        System.out.println("search(\"HTML\") → " + stack.search("HTML")); // 2 (from top, 1-based)

        // ======= 🔸 COMMON VECTOR METHODS =======

        // add(E e)
        stack.add("Java");
        System.out.println("add() → " + stack); // [HTML, CSS, Java, Java]

        // get(int index)
        System.out.println("get(1) → " + stack.get(1)); // CSS

        // set(int index, E element)
        stack.set(2, "React");
        System.out.println("set(2, React) → " + stack); // [HTML, CSS, React]

        // remove(int index)
        stack.remove(1);
        System.out.println("remove(1) → " + stack); // [HTML, React]

        // contains(Object o)
        System.out.println("contains(\"HTML\") → " + stack.contains("HTML")); // true

        // size()
        System.out.println("size() → " + stack.size()); // 2

        // isEmpty()
        System.out.println("isEmpty() → " + stack.isEmpty()); // false

        // clear()
        stack.clear();
        System.out.println("clear() → " + stack); // []
    }
}
