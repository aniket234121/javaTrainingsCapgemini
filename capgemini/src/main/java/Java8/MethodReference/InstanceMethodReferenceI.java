package Java8.MethodReference;
import java.util.*;
public class InstanceMethodReferenceI {
    public<T> void print(T data)
    {
        System.out.println(data);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        InstanceMethodReferenceI instanceMethodReferenceI = new InstanceMethodReferenceI();
        list.forEach(instanceMethodReferenceI::print);
    }
}
