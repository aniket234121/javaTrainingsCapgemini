package Polymorphism.methodShadowing;

public class shadowing extends Parent {
    public static void m(){
        System.out.println("shadowing m");
    }

    public static void main(String[] args) {
        Parent p = new shadowing();
        p.m();

        shadowing s=new shadowing();
        s.m();
    }
}
