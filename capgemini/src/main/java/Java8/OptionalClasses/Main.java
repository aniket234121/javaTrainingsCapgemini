package Java8.OptionalClasses;
import org.example.Employee;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        OptionalClassExample ex=new OptionalClassExample();
        Optional optional=ex.getEmployee(); //return employee object as value.
//        Optional optional=ex.canReturnNUll(); //returns null


//        if(optional.isPresent())
//        {
//            System.out.println(optional.get());
//        }

        //clear and concise way
        optional.ifPresent(System.out::println);

    }
}
