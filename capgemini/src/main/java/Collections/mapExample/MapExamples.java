package Collections.mapExample;
import com.scoping.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExamples {
    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee("aniket","gzb",22),1299);
        map.put(new Employee("ram","ubb",23),134);
        map.put(new Employee("taru","bih",90),123);
        map.put(new Employee("thapa","kk",7),1);

        Set<Map.Entry<Employee, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Employee, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Employee, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" :::: "+entry.getValue());
        }
    }
}
