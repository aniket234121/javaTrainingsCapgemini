package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
//        list.stream().toList().forEach(System.out::println);

        //reduce method will return option type we have get() to get the reduced element
        Integer val=list.stream().filter((element)-> element % 2 == 0).map(num -> num * num).reduce((total,num)->total +=num).get();
        System.out.println(val);
    }
}
