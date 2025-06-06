package Java8.Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalinterfacesExample {

    public static void main(String[] args) {
        // Predicate

        Predicate<Integer> predicate=x->x%2==0;

        List<Integer> list= Arrays.asList(1,12,23,43,45,56);
        list.stream().filter(predicate).forEach(System.out::println);

        // OR

        System.out.println("Predicate 24 is even: "+predicate.test(24));


        // Function

        Function<String,Integer> function=str->str.trim().length();

        Function<String,String> function2=str->str.toLowerCase();
        System.out.println("Function : "+function.apply("   ram is a  "));


        System.out.println(function.compose(function2).apply("      hello"));     //  compose

        // Consumer

        Consumer<Integer> consumer=System.out::println;
        consumer.accept(309909);

        //Supplier

        Supplier<Double> supplier =()->Math.random();
        Supplier<String> supplier2=()->"fuck you";

        System.out.println(supplier.get());
        System.out.println(supplier2.equals("fuck you"));
        





    }
}
