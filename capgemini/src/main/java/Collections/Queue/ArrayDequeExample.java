package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        // Create an ArrayDeque of Strings
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.addFirst("Java");
        deque.addLast("Python");
        deque.offerFirst("C++");
        deque.offerLast("JavaScript");

        System.out.println("Deque after additions: " + deque);
        // Output: [C++, Java, Python, JavaScript]

        // Remove elements from both ends
        String front = deque.removeFirst();  // removes "C++"
        String rear = deque.removeLast();    // removes "JavaScript"
        System.out.println("Removed first: " + front);
        System.out.println("Removed last: " + rear);
        System.out.println("Deque after removals: " + deque);
        // Output: [Java, Python]

        // Stack-like operations
        deque.push("Go");  // push at front
        System.out.println("After push: " + deque);
        // Output: [Go, Java, Python]

        String popped = deque.pop();  // pops "Go"
        System.out.println("Popped: " + popped);
        System.out.println("After pop: " + deque);
        // Output: [Java, Python]

        // Peek operations
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());
    }
}

