package DataStructures.Stack;

public class StackLL {
    private class Node{
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
        }
    }
    private Node head;
    public void push(String data) {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public String peek(){
        if(head==null)
        {
            return "-1";
        }
        return head.data;
    }
    public String pop(){
       if(head==null)
       {
           System.out.println("stack is empty");
           return "";
       }
//       System.out.println("popped "+head.data);
        String data = head.data;
       head = head.next;
       return data;
    }
    public String toString() {
        if(head==null)
        {
            return "[]";
        }
        Node temp = head;
        StringBuffer sb = new StringBuffer("");
        while(temp!=null)
        {
           sb.append("|| "+temp.data+" ||\n");
           temp=temp.next;
        }
        return sb.toString();
    }
}
