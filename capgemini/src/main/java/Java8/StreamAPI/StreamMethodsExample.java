package Java8.StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
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


        int[] array=new int[]{1,12,23,3,4,5,6,8,7,23,1};

        //  Map
        System.out.println("map");
        Arrays.stream(array).map(x->x*2).forEach(System.out::println);

        //  Filter
        System.out.println("filter");
        Arrays.stream(array).filter(x->x%2==0).forEach(System.out::println);

        // distinct and sorted
        System.out.println("sorted and distinct");
        Arrays.stream(array).distinct().sorted().forEach(System.out::println);

        //  limit and skip
        System.out.println("limit and skip");
        Arrays.stream(array).limit(5).skip(2).forEach(System.out::println);

        //collect
        System.out.println("collect");
        List<Integer> list= Arrays.stream(array).boxed().filter(x->x>5).toList();
        list.forEach(System.out::println);


        // FLatMap (nested lists)
        int[][] nos=new int[][]{{1231321,342342342},{1231321231,234234234},{21231321,642342342}};

        List<Integer> phoneNos=Arrays.stream(nos)
        .flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
        System.out.println(phoneNos);



    }

}
