package DataStructures.Stack;

public class Driver {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("peek "+stack.peek());
//        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
    }
}
