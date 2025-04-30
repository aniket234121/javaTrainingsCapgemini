package Java8.MethodReference;

public class ConstructorReferenceII {
    public static void main(String[] args) {
        EmployeeFactory2 emp=ConstructorReferenceII::getEmp;
        Employee2 employee=emp.getEmployee("aniket",23);
        System.out.println(employee);
    }
    public static Employee2 getEmp(String name, int age) {
        return new Employee2(name,age);
    }
}

class Employee2{
    String name;
    Integer age;

    public Employee2() {
        System.out.println("Employee Constructor");
    }
    public Employee2(String name, Integer age){
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
interface EmployeeFactory2{
    public abstract Employee2 getEmployee(String name, Integer age);
}