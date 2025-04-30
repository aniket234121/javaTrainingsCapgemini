package Java8.HigherOrderFunction;

public class HigherOrderFunctionExample {
    public static void main(String[] args) {
        m1(()->System.out.println("hi"));
        m1(()->System.out.println("bye"));
    }
    public static void m1(Task t) {
        t.action();
    }

}
interface Task{
    void action();
}
