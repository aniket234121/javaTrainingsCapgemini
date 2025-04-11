package Inheritance;

public class Child extends Parent {
    static int num=5;
    int m=234;
    static
    {
        System.out.println("Child static block");
    }
    {
        System.out.println("child non static block");
    }
    public static void main(String[] args) {
        Child child = new Child();
    }
    public static void m3(){
        System.out.println("child static void method");
    }
    public void m4()
    {
        System.out.println("child non static mehtod");
    }
    Child(){
        System.out.println("Child class constructor");
    }
}
