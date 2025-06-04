package Java8.OptionalClasses;

import org.example.Employee;

import java.util.Optional;

public class OptionalClassExample {
    public Optional<Employee> canReturnNUll(){
        System.out.println("Can Return NUll method runs");
        return Optional.ofNullable(null);
    }
    public Optional<Employee> getEmployee(){
        return Optional.of(new Employee(12,"ram",(byte)21));
    }
}
