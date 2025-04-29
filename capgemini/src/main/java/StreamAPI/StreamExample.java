package StreamAPI;

import java.util.ArrayList;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(121);
        list.add(122);
        list.add(123);
        list.add(124);
        list.add(125);
        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
