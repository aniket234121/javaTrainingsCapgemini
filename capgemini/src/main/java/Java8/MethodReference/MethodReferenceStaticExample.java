package Java8.MethodReference;

public class MethodReferenceStaticExample {
    public static void main(String[] args) {
        I i=Math::pow;
        System.out.println(i.demo(2,3));

    }

}
class A{
    public A(){
        System.out.println("A");
    }
}
interface I {
    double demo(int a ,int b);
}

