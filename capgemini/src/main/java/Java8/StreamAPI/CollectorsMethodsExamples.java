package Java8.StreamAPI;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CollectorsMethodsExamples   {

    static class Employee {
        String name;
        String department;
        int age;

        Employee(String name, String department, int age) {
            this.name = name;
            this.department = department;
            this.age = age;
        }

        String getName() { return name; }
        String getDepartment() { return department; }
        int getAge() { return age; }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Bob");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 30),
                new Employee("Bob", "IT", 25),
                new Employee("Charlie", "IT", 35),
                new Employee("David", "HR", 28),
                new Employee("Eve", "Sales", 40)
        );

        // 1. toList
        List<String> list = names.stream().collect(Collectors.toList());

        // 2. toSet
        Set<String> set = names.stream().collect(Collectors.toSet());

        // 3. toMap
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (a, b) -> a));

        // 4. joining
        String joined = names.stream().collect(Collectors.joining(", ", "[", "]"));

        // 5. groupingBy
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // 6. groupingBy with counting
        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        // 7. partitioningBy
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // 8. counting
        long total = names.stream().collect(Collectors.counting());

        // 9. summarizingInt
        IntSummaryStatistics stats = names.stream()
                .collect(Collectors.summarizingInt(String::length));

        // 10. mapping
        Map<String, List<Integer>> deptAges = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getAge, Collectors.toList())));

        // 11. reducing
        int sum = numbers.stream().collect(Collectors.reducing(0, Integer::sum));

        // 12. collectingAndThen
        List<String> unmodifiableNames = names.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        // Output for visual verification
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map (toMap): " + nameLengthMap);
        System.out.println("Joined: " + joined);
        System.out.println("Grouped By Dept: " + groupedByDept);
        System.out.println("Dept Count: " + deptCount);
        System.out.println("Partitioned (Even/Odd): " + partitioned);
        System.out.println("Count: " + total);
        System.out.println("Summary Stats: " + stats);
        System.out.println("Mapped Dept Ages: " + deptAges);
        System.out.println("Sum (Reducing): " + sum);
        System.out.println("Unmodifiable Names: " + unmodifiableNames);
    }
}
