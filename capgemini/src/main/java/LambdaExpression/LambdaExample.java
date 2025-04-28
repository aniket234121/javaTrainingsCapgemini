package LambdaExpression;

public class LambdaExample {
    public static void main(String[] args) {
        Test add=(a,b)->a+b; //lambda expression
        Test sub=(a,b)->a-b;
        Test mul=(a,b)->a*b;
        System.out.println("add "+add.action(10,29)); //calling the method.
        System.out.println(sub.action(100,29));
        System.out.println(mul.action(10,29));
    }
}

//functional interface -- having only one abstract method and n no. of default and static can be present or may not.
interface Test{
    int action(int a,int b);
}
