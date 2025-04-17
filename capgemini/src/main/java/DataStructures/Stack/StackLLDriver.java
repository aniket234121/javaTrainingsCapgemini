package DataStructures.Stack;

public class StackLLDriver {
    public static void main(String[] args) {
        StackLL stack =new StackLL();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
        stack.pop();
        System.out.print(stack);
        System.out.println(stack.peek());
    }
}
