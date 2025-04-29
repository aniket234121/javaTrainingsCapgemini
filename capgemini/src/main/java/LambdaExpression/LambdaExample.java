package LambdaExpression;

import java.util.Arrays;

public class LambdaExample {
    public static void main(String[] args) {
        //lambda expression
        Test add=(a,b)->a+b;
        Test sub=(a,b)->a-b;
        Test mul=(a,b)->a*b;
        System.out.println("add "+add.action(10,29)); //calling the method.
        System.out.println(sub.action(100,29));
        System.out.println(mul.action(10,29));



        //example 2.
        Integer[] arr={32,23,453,123,45,3};
        Arrays.sort(arr,(a, b)->a-b); // implementation of comparator into lambda expression form..
        System.out.println(Arrays.toString(arr));

    }
}

//functional interface -- having only one abstract method and n no. of default and static can be present or may not.
interface Test{
    int action(int a,int b);
}
