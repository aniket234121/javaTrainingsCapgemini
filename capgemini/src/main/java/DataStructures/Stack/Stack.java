package DataStructures.Stack;

public class Stack {
    private int[] stack;
    private int top;
    public Stack(int size) {
        this.stack = new int[size];
        this.top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int value) {
        if(top==stack.length-1)
        {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = value;
    }
    public int pop() {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek() {
        return stack[top];
    }
    public void printStack()
    {
      int counter=top;
      if(top==-1)
      {
          System.out.println("Stack is empty");
          return;
      }
        while(counter>=0)
        {
           System.out.println("|| "+stack[counter--]+" ||");
        }
    }
}
