package ComparableExamples;

import org.example.Employee;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
