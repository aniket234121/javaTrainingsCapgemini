package DataStructures.Stack;

public class StackScenario {
    private StackLL stack=new StackLL();
    private StackLL forward=new StackLL();
    public void visit(String url)
    {   System.out.println("visited "+url);
        stack.push(url);
        forward=new StackLL();
    }
    public void back(){
      forward.push(stack.pop());
      System.out.println("back to "+stack.peek());
    }
    public void currentPage(){
        System.out.println("current page "+stack.peek());
    }
    public void next(){
        stack.push(forward.pop());
        System.out.println("next to "+stack.peek());
    }
    public static void main(String[] args) {
        StackScenario s=new StackScenario();
        s.visit("http://www.gfg.com");
        s.visit("http://www.gpt.com");
        s.visit("http://www.youtube.com");
        s.visit("http://www.facebook.com");
        s.back();
        s.back();
        s.visit("http://www.w3s.com");
        s.visit("http://git.com");
        s.back();
        s.back();
        s.next();
        s.currentPage();
    }
}
