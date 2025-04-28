package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
//        stack.pop();
//        stack.peek();
        stack.push("Hello");
        stack.add("python");
        stack.push("World");
        stack.push("Java");
//
//        stack.remove("Hello");
        stack.remove(2);
        System.out.println(stack);
        System.out.println(stack.contains("Python"));

    }
}
