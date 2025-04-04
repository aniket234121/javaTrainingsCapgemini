package Abstraction.Interfaces;

public interface example {
    int a=20;
    static void m2(){
        System.out.println(a);
    }
    default void m(){
        System.out.println(a);
    }
}
