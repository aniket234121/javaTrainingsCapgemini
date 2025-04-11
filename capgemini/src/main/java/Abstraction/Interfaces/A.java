package Abstraction.Interfaces;

public class A implements p1,p2{

    @Override
    public void m1() {
        p1.super.m1();
    }
}
interface p1{
    default void m1()
    {
        System.out.println("m1");
    }
}

interface p2{
    default void m1(){
        System.out.println("m2");
    }
}