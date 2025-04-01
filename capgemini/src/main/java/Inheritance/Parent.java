package Inheritance;

public class Parent {
    public static int num=5;
    int a=323;
    static{
        System.out.println("parent class static block");
    }
    {
        System.out.println("parent class non static block");
    }
    public static void m1(){
        System.out.println("parent static void method");
    }
    public void m2(){
        System.out.println("parent class non static method");
    }
    Parent(){
        System.out.println("parent class constructor");
    }
}
