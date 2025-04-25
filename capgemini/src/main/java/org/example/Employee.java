package org.example;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    byte age;
    public boolean isApplicable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public Employee(int id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && age == employee.age && isApplicable == employee.isApplicable && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, isApplicable);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isApplicable=" + isApplicable +
                '}';
    }
}
