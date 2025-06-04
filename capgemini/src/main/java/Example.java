
public class Example extends Example2 implements I1,I2{

    public static void main(String[] args) {
    Example e1=new Example();
    e1.m1();
    }


}
class Example2 {
    public void m1()
    {
        System.out.println("Hello World");
    }
}
