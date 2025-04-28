package Collections;

import java.util.HashSet;
import java.util.Set;
import org.example.Employee;
public class HashSetExample {
    public static void main(String[] args) {
        Set<Employee> set=new HashSet<>();
        set.add(new Employee(23,"eesh",(byte)23));
        set.add(new Employee(24,"ram",(byte)24));
        set.add(new Employee(56,"biba",(byte)56));
        set.add(new Employee(334,"bob",(byte)34));
        set.add(new Employee(334,"bob",(byte)34));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(new Employee(24,"ram",(byte)24)));
    }
}
