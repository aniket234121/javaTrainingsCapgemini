package MethodReference;

public class ConstructorReference {
    public static void main(String[] args) {
        EmployeeFactory empFactory=Employee::new;
        Employee emp= empFactory.getEmployee("John Hammond", 25);
        System.out.println(emp);
    }
}

class Employee{
    String name;
    Integer age;

    //Contructor of employee
    public Employee(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
interface EmployeeFactory{
public abstract Employee getEmployee(String name, Integer age);
}
