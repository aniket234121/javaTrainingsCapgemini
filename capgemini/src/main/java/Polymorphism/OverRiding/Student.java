package Polymorphism.OverRiding;

public class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
