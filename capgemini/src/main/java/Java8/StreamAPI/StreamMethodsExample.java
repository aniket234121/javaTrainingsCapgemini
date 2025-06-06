package Java8.StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsExample {

    public static void main(String[] args) {

        String [] arr=new String[]{"ram","shyam","kad","awesome","thai","alike"};
        Stream<String> stream= Arrays.stream(arr);

        System.out.println("----list---");
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("-------");

        //anyMatch()
        System.out.println("kad is in list (anyMatch()): "+stream.anyMatch(item->item.equalsIgnoreCase("kad")));
        //allMatch()
        System.out.println("all items contain a (allMatch()): "+Arrays.stream(arr).allMatch(item->item.contains("a")));
        //noneMatch()
        System.out.println("no items contain `a` (noneMatch()): "+ Arrays.stream(arr).noneMatch(item->item.contains("a")));
        System.out.println("find First word with 'am':(findFirst()): "+Arrays.stream(arr).filter(item->item.contains("am")).findFirst().get());
        System.out.println("find any word starts with a (findAny()): "+Arrays.stream(arr).filter(item->item.startsWith("a")).findAny().get());
        System.out.println("count the total no of items in list after filter (count()): "+Arrays.stream(arr).filter(item->item.startsWith("a")).count());
        System.out.println("collect the items in a list(collect()): "+Arrays.stream(arr).filter(item->item.startsWith("k")||item.endsWith("m")).collect(Collectors.toList()));

    }

}
