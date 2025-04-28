package Collections;

import ComparableExamples.EmployeeAgeComparator;
import org.example.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Employee> v = new Vector<>();
        v.add(new Employee(12,"ram", (byte) 21));
        v.add(new Employee(13,"bob", (byte) 72));
        v.add(new Employee(14,"john", (byte) 83));
        v.add(new Employee(15,"mary", (byte) 24));
        v.add(new Employee(16,"sam", (byte) 29));

        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }

        ListIterator<Employee> iterator = v.listIterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
//            System.out.println(employee);
            if(employee.getAge()>45) {
                employee.isApplicable = true;
            }
        }
        Comparator<Employee> c=new EmployeeAgeComparator();
//        v.sort(c);
        Collections.sort(v,c);

        iterator=v.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(v.contains(new Employee(16,"sam",(byte)29)));
    }
}
