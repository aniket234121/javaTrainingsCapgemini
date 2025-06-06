package Java8.StreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysCreateStream {

    public static void examples(){
        // empty stream...
        Stream<Integer> stream= Stream.empty();

        //Stream from Arrays
        System.out.println("-------from arrays-----");
        String[] arr=new String[]{"hi","hello","ram"};
        Stream<String> stream2= Arrays.stream(arr);
        stream2.forEach(System.out::println);

        //Stream from collections
        System.out.println("-------from collections-----");
        List<String> list=Arrays.asList(arr);
        Stream<String> stream3=list.stream();
        stream3.forEach(System.out::println);


        //Stream from String
        System.out.println("-------from string-----");
        String str="this is normal string";
        IntStream charStreams=str.chars();

        charStreams.mapToObj(item->(char)item).forEach(System.out::println);  // mapToObj will convert & map each int to char

        //Stream from

    }
    public static void main(String[] args) {
        examples();
    }
}
